import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import upickle.default._
import scala.scalajs.js.annotation.JSExport

case class Props(numPages: Int, currentPage: Int)

@JSExport
object PaginationComponent {
  class Backend($: BackendScope[Props, _]) {
    private val onClickPageNumber: Int => ReactEventI => Callback = pageNumber => e => {
      e.preventDefaultCB
    }

    def render(P: Props): ReactElement = {
      <.ul(^.cls := "pagination pagination-sm")(
        (1 to P.numPages).map { pageNumber =>
          val isCurrentPage = pageNumber == P.currentPage

          <.li(isCurrentPage ?= (^.cls := "active"))(
            <.a(^.href := "#", ^.onClick ==> onClickPageNumber(pageNumber))(pageNumber)
          )
        }
      )
    }
  }

  private val component =
    ReactComponentB[Props]("PaginationComponent")
      .stateless
      .renderBackend[Backend]
      .build

  def apply(props: Props) = component(props)

  @JSExport("apply")
  def apply(upicklePayload: String) = component(read[Props](upicklePayload))
}

var express = require('express');

React          = require('react');
ReactDOMServer = require('react-dom/server');

var Pagination = require('./target/scala-2.11/sjs-react-server-prerender-fastopt.js');

var app = express();

app.get('/pagination', function (req, res) {
  var payload = '{"numPages":10,"currentPage":2}';

  res.send(ReactDOMServer.renderToString(Pagination.PaginationComponent().apply(payload)));
});

app.listen(3000, function(err) {
  if (err) throw err
  console.log('Listening on 3000...')
});

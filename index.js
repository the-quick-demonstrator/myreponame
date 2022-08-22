const app = require('kuiz-md');

let markdown = ''

markdown +='answer not valid';
markdown +='(x) answer valid';
markdown +='(x) answer valid';
markdown +='( ) answer not valid';

const yourCallback = (data) => {
  alert('User ' + data.email + ' had grade ' + data.grade);
};
const elementIdToRenderInto = "my-kuiz"

app.init(markdown, yourCallback, elementIdToRenderInto);
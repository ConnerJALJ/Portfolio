function submitStory(form) {
  document.getElementById('story-input').style.visibility = 'hidden';
  document.getElementById('story-output').style.visibility = 'visible';

  var storyInputs = form.elements.namedItem('story-piece');
  var blankSpaces = document
    .getElementById('story')
    .getElementsByClassName('unfilled');

  for (var i = 0; i < storyInputs.length; i++) {
    if (storyInputs[i].value) {
      blankSpaces[i].innerHTML = storyInputs[i].value;
      blankSpaces[i].style.color = 'blue';
    } else {
      blankSpaces[i].innerHTML = '&lt;missing text&gt;';
      blankSpaces[i].style.color = 'red';
    }
  }
}

function returnToInput() {
  document.getElementById('story-input').style.visibility = 'visible';
  document.getElementById('story-output').style.visibility = 'hidden';
}

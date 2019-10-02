// gobal variable storing all the entered numbers in an array
var input;
// update input as user enters into the text field
document.getElementById('array-of-numbers').oninput = () => {
  input = document
    .getElementById('array-of-numbers')
    .value.trim()
    .split(' ')
    .map(function (numString) {
      return Number(numString);
    });

  // check validity of user input
  for (let i = 0; i < input.length; i++) {
    if (!input || Number.isNaN(input[i])) {
      document.getElementById('array-of-numbers').setCustomValidity('Please enter a list of numbers separated by a space!');
      break;
    } else {
      document.getElementById('array-of-numbers').setCustomValidity('');
    }
  }
}

// returns the mean of input
mean = arr => arr.reduce((acc, val) => acc + val, 0) / input.length;
// displays the mean ...rounded to the 1000s place
showMean = () =>
  (document.getElementById('mean-output').innerHTML =
    'The Mean is: ' + Math.round(mean(input) * 1000) / 1000);

// returns the variance of input
variance = arr =>
  arr.reduce((acc, val) => acc + Math.pow(val - mean(input), 2), 0) /
  (input.length - 1);
// displays the variance ...rounded to the 1000s place
showVariance = () =>
  (document.getElementById('variance-output').innerHTML =
    'The Variance is: ' + Math.round(variance(input) * 1000) / 1000);

// retuns the standard deviation of input
stdDeviation = arr => Math.sqrt(variance(arr));
// displays the standard deviation ...rounded to the 1000s place
showStdDeviation = () =>
  (document.getElementById('std-deviation-output').innerHTML =
    'The Standard Deviation ' + Math.round(stdDeviation(input) * 1000) / 1000);
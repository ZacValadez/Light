let light = document.getElementById('light');
let text = document.getElementById('light-text');
let subText = document.getElementById('sub-text');
let isLightOn = false;

function toggleLight() {
  isLightOn = !isLightOn;
  if (isLightOn) {
    light.classList.remove('off');
    light.classList.add('on');
    document.body.style.backgroundColor = 'white';
    text.innerText = 'Zac Valadez';
    text.style.color = 'black'; // Change text color to white
    subText.innerText = 'Hello, my name is Zac and I am 15 years old my hobbies are playing video games such as Fortnite and Call of Duty with my friends. I also enjoy playing sports like basketball and soccer with my friends. The last hobby I have is to try to learn classical songs on the piano. For my passion, I want to work in something that involves creating code for apps.';
    subText.style.color = 'black'; // Change sub text color to white
  } else {
    light.classList.remove('on');
    light.classList.add('off');
    document.body.style.backgroundColor = 'black';
    text.innerText = 'Zac Valadez';
    text.style.color = 'white'; // Change text color to black
    subText.innerText = 'Hello, my name is Zac and I am 15 years old my hobbies are playing video games such as Fortnite and Call of Duty with my friends. I also enjoy playing sports like basketball and soccer with my friends. The last hobby I have is to try to learn classical songs on the piano. For my passion, I want to work in something that involves creating code for apps.';
    subText.style.color = 'white'; // Change sub text color to black
  }
}

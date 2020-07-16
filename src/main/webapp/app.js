 <script>
const handlerSubmit = document.querySelector('.form');
const list = document.querySelector('.list'); 
const addBtn = document.querySelector('.submit'); 

const firstInput = document.querySelector('#text');
const secondInput = document.querySelector('#num'); 

let user = {};

handlerSubmit.addEventListener('submit', function (e) {
    e.preventDefault();
    firstInput.value = '';
    secondInput.value = ''
});

addBtn.addEventListener('click', function () {
    let li = document.createElement('li');
    var a = document.createElement('a');
    a.setAttribute('href', 'http://localhost:9876/times/info/?id='+firstInput.value);
    a.innerHTML = firstInput.value;
    li.append(a);
    li.append("UTC: "+secondInput.value);
    user = {
        id: firstInput.value,
        utc: secondInput.value
    };
    console.log(user);
    list.append(li);
    var http = new XMLHttpRequest();
    	var url = "http://localhost:9876/times";
    	var params = "group="+firstInput.value+"&utc="+secondInput.value;
    	http.open('POST', url, true);
    	http.setRequestHeader('Content-type', "application/x-www-form-urlencoded;charset=utf-8");
    	http.send(params);
    })
</script>
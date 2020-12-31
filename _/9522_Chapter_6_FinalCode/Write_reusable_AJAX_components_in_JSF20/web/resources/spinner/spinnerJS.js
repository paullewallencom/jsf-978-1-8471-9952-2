var steps = {};
    
function initSpinner(comp_id, step) {
    if (isNaN(step)) {
        steps[comp_id]= 1;
    }else{
        steps[comp_id] = Number(step);
    }
}

function goDirection(comp_id,s) {
    var obj = document.getElementById(comp_id+":"+"nrID");
    var cv = Number(obj.value);
    if ((isNaN(cv)) || (cv == 0)) { 
        cv = 0;
    }
    obj.value = cv + (s * steps[comp_id]);
    return false;
}


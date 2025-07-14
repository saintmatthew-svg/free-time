function AirConditioner(Temperature, callBackFunction){
	return callBackFunction(Temperature);
};

function TurnOn(){
    return true;
};

function TurnOff(){
    return false;
};

function Increase(Temperature){
    if(TurnOn() && Temperature < 30){
        return Temperature + 1;
    };    
    return Temperature;
};

function Decrease(Temperature){
    if(TurnOn() && Temperature > 16){
        return Temperature - 1;
    };
    return Temperature;
};

module.exports = {AirConditioner, TurnOn, TurnOff, Increase,Decrease}
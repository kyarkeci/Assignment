    public class AirConditioner{

        private boolean isOn;

        private String productName;

        private int temperature;

        
        public AirConditioner(String productName){

            this.productName = productName;

        }

        public void decreaseTemperature(int temp){
        
            if(temperature - 1 >14){
                            
                temperature =  temperature - temp;    
            }
        }

        public String getProductName(){

            return productName;
        }

        public int getTemperature(){
            
           return temperature;
        }

        public void increaseTemperature(int temp){
         
            if(temperature + 1 <30){
                            
                temperature =  temperature + temp;    
            }

        }

        public boolean isOn(){

            if(isOn == true){

                return isOn;
            }
                else{
                    return false;
                }
           
        }

        public void setOn(boolean isOn){

           this.isOn = isOn;
        }

        public void setProductName(String productName){

            
        }

        public void setTemperature(int temperature){

            if(temperature > 14 && temperature <31){

                this.temperature = temperature;
                
            }
    
                else if(temperature <= 14){

                    this.temperature = 15;
                
                }

                    else{this.temperature = 30;

                    }
            
        }

    
    }

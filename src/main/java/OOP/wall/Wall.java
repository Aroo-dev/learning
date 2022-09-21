package OOP.wall;

public class Wall {

        private double height;
        private double width;

        public Wall(double height, double width) {
                setHeight(height);
                setWidth(width);
        }

        public Wall() {
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
                if(this.height < 0){
                        this.height = 0;
                }
        }

        public double getWidth() {
                return width;
        }

        public void setWidth(double width) {
                this.width = width;
                if (this.width < 0){
                        this.width = 0;
                }
        }
        public double getArea (){

                return Math.round(this.width * this.height);
        }
}
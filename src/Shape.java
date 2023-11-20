

/**
 * Represents any shape.
 */
    public abstract class Shape implements Comparable<Shape> {
        private int id;
        private static int numShapes;

        /**
         * Parameterless constructor
         */
        public Shape() {
            ++numShapes;
            setId(numShapes);
        }

        /**
         * Returns the number of shapes that have been created so far
         * @return number of shapes created
         */
        public static int getNumShapes()
        {
            return numShapes;
        }

        /**
         * Returns the id of the object
         * @return the auto-generated id
         */
        public int getId()
        {
            return id;
        }

        private void setId(int id) {
            this.id = id;
        }

        public int compareTo(Shape other){
            double thisArea = this.computeArea();
            double otherArea = other.computeArea();
            if(thisArea<otherArea){
                return -1;
            }
            if(thisArea>otherArea){
                return 1;
            }
            else{
                return -1;
            }

        }
        public abstract void draw(int x, int y);
        /**
         * Computes the area of the shape
         * @return the shape's area
         */
        public abstract double computeArea();

        /**
         * Computes the perimeter of the shape
         * @return the shape's perimeter
         */
        public abstract double computePerimeter();

        public abstract double getDiameter();

        public abstract void setDiameter(double diameter);


        /**
         * Creates a string representation of the object
         * @return the object's type, area, and perimeter
         */
        public abstract String toString();

        

}

public abstract class  Peoples {
     
        protected int age;
        protected int numberOflegs;


        public Peoples(int age, int numberOflegs) {
            this.age = age;
            this.numberOflegs = numberOflegs;
        }


        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getNumberOflegs() {
            return numberOflegs;
        }
        public void setNumberOflegs(int numberOflegs) {
            this.numberOflegs = numberOflegs;
        }


        @Override
        public String toString() {
            return "Peoples [age=" + age + ", numberOflegs=" + numberOflegs + "]";
        }

        public abstract String graduate();

}

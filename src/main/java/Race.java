public class Race {

    String winnerName = ""; // чтобы записывать лидера
    int winnerDistance = 0; // чтобы записывать дистанцию лидера и сравнивать

    public void calculateDistance (Car car){
       int distance = car.speed * 24; //считаем дистанцию
       if (distance > winnerDistance) {
           winnerDistance = distance; //
           winnerName = car.name; // выбираем лидера
       }
    }
    public void printWinner(){
        System.out.println("Самая быстрая машина: " + winnerName); // метод, который выдает победителя
    }

   }



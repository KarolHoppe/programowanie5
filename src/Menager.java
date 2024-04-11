import java.util.ArrayList;
import java.lang.Object;
import java.util.List;

public class Menager extends Employee {
    public Menager(String imie, String nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
        super(imie, nazwisko, adres, email, pesel, rokzatrudnienia);
    }

    public void addGoals(Goal g) {
    }

    class Manager extends Employee {
        List<Goal> goals = new ArrayList<>();

        Manager(String imie, String nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
            super(imie, nazwisko, adres, email, pesel, rokzatrudnienia);
        }

        void addGoals(Goal goal) {
            goals.add(goal);
        }

        @Override
        public int calculateSalary() {
            int baseSalary = super.calculateSalary();
            int bonus = 0;
            for (Goal goal : goals) {
                if (goal.isAchievedThisMonth()) {
                    bonus += goal.getBonus();
                }
            }
            return baseSalary + bonus;
        }
    }
}

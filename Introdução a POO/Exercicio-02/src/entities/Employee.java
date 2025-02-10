
package entities;

public class Employee {
   public String name;
   public double grossSalary;
   public double tax;

   public Employee() {
   }

   public double netSalary() {
      return this.grossSalary - this.tax;
   }

   public void increaseSalary(double porcentage) {
      this.grossSalary *= 1.0 + porcentage / 100.0;
   }

   public String toString() {
      String var10000 = this.name;
      return var10000 + ", $" + String.format("%.2f", this.netSalary());
   }
}

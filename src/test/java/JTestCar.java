import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;

public class JTestCar {

	Car car;

	@Before
	public void setup() {
		car = new Car();
	}

	@Test
	public void testFailsBecauseCarCantChangeGear() 
	{
			car.changeGear(Gear.D);
			assertEquals(car.getGear(), Gear.D);
	}

	@Test
	public void testPassesAfterChangingCarGear() 
	{
		car.changeGear(Gear.D);
		assertEquals(car.getGear(), Gear.D);
	}
	
	public void testThrowErrorChecking() 
	{
		try
		{
			car.changeGear(Gear.D);
			car.changeGear(Gear.R);
		}
		catch(Exception e)
		{
			assertEquals(e.getMessage(), "Can't change to REVERSE gear when D gear is engaged!");
		}
	}
} 

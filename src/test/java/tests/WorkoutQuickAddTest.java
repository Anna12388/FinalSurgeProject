package tests;

import models.WorkoutQuickAdd;
import models.WorkoutQuickAddFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import static org.testng.Assert.*;

public class WorkoutQuickAddTest extends BaseTest {
    @Test
    public void addQuickWorkout() {
        loginPage.open()
                .inputEmailAndPass(email,password)
                .clickSignInButton()
                .selectPlatformAndClick()
                .clickProfileIcon()
                .selectMyProfileFromDropdown()
                .goToTrainingCalendar();
        trainingCalendarPage.clickQuickAdd();

        WorkoutQuickAdd workoutQuickAdd = WorkoutQuickAddFactory.getData();

        workoutQuickAddPage.editWorkout(workoutQuickAddPage)
                .clickAddWorkout();

        String date = workoutQuickAdd.getDate();
        String activityType = workoutQuickAdd.getActivityType();

        assertTrue(trainingCalendarPage.isWorkoutPresent(date, activityType),
                "The workout was not added successfully");
    }
}

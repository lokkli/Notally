import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.omgodse.notally.R
import com.omgodse.notally.activities.MainActivity
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Allure.step
import io.qameta.allure.kotlin.junit4.DisplayName
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
@DisplayName("Тест kotlin")
class MainPageTest {
    @get:Rule
    val activityRule
        get() = ActivityScenarioRule(MainActivity::class.java)

    @Test
    @DisplayName("Тест гланвый экран")
    fun mainPageTest() {
        step("Проверка главного экрана"){
           onView(withText("Notally")).check(matches(withText("Notally")))
        }

        step("") { onView(withId(R.id.TakeNoteFAB)).perform(ViewActions.click()) }
    }
}
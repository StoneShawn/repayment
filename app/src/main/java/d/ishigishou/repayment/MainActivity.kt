package d.ishigishou.repayment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import d.ishigishou.repayment.di.not_use_di.Car
import d.ishigishou.repayment.di.use_di.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        NotUseDi()
        UseDi()
    }


    fun NotUseDi(){
        val car = Car()
        car.start()
    }

    fun UseDi(){
        val engine = Engine()
        val superEngine = SuperEngine()
        val car = Car(superEngine)
        car.start()
    }
}


package guilhermekunz.com.br.cineflix.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import guilhermekunz.com.br.cineflix.R
import guilhermekunz.com.br.cineflix.api.MoviesRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRepository.getPopularMovies()
    }
}
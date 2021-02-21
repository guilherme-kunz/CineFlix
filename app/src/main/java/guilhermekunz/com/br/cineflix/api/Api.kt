package guilhermekunz.com.br.cineflix.api

import guilhermekunz.com.br.cineflix.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "YOUR_API_KEY_HERE",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}
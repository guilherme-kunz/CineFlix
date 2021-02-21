package guilhermekunz.com.br.cineflix.api

import guilhermekunz.com.br.cineflix.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "ff8fb9dee660f60289aa33b24f3c35be",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}
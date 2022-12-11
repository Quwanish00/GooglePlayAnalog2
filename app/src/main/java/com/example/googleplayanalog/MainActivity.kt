package com.example.googleplayanalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.googleplayanalog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val rvAdapter = RvAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.adapter = rvAdapter
        setMockData()


    }

    private fun setMockData() {
        val games = mutableListOf<Items>()


        repeat(23) {
            val game = mutableListOf<Game>()
            val rek = mutableListOf<Reklama>()


            when (it) {
                0 -> {
                    games.add(GameTypes(it, "Лучшие игры"))

                }
                1 -> {
                    repeat(10) { i ->


                        game.add(
                            Game(i, R.drawable.pubg_1, R.drawable.pubg_icon, "Pubg -Mobile")
                        )
                    }
                    games.add(GameItem(it, game))

                }
                2 -> {
                    games.add(GameTypes(it, "Играют все"))

                }
                3 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.img, R.drawable.subway_surf, "Subway-surf")
                        )

                    }
                    games.add(GameItem(it, game))
                }

                5 -> {
                    games.add(GameTypes(it, "Онлайн игры"))

                }
                6 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.fifa2015_1, R.drawable.fifa2015_icon, "FIFA 2015")
                        )

                    }
                    games.add(GameItem(it, game))
                }
                7 -> {
                    repeat(10) {i->
                        rek.add(
                            Reklama(
                                i,
                                "Последние новости",
                                R.drawable.fgansiya,
                                "Узнайте больше"
                            )
                        )
                    }
                    games.add(RvRek(it, rek))
                }
                9 -> {
                    games.add(GameTypes(it, "Лучшие игры"))

                }
                10 -> {
                    repeat(10) { i ->


                        game.add(
                            Game(i, R.drawable.pubg_1, R.drawable.pubg_icon, "Pubg -Mobile")
                        )
                    }
                    games.add(GameItem(it, game))

                }
                11 -> {
                    games.add(GameTypes(it, "Играют все"))

                }
                12 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.img, R.drawable.subway_surf, "Subway-surf")
                        )

                    }
                    games.add(GameItem(it, game))
                }
                13 -> {
                    games.add(GameTypes(it, "Онлайн игры"))

                }
                14 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.fifa2015_1, R.drawable.fifa2015_icon, "FIFA 2015")
                        )

                    }
                    games.add(GameItem(it, game))
                }
                15 -> {
                    repeat(10) {i->
                        rek.add(
                            Reklama(
                                i,
                                "Последние новости дня",
                                R.drawable.portu,
                                "Узнайте больше"
                            )
                        )
                    }
                    games.add(RvRek(it, rek))
                }
                16 -> {
                    games.add(GameTypes(it, "Лучшие игры"))

                }
                17 -> {
                    repeat(10) { i ->


                        game.add(
                            Game(i, R.drawable.pubg_1, R.drawable.pubg_icon, "Pubg -Mobile")
                        )
                    }
                    games.add(GameItem(it, game))

                }
                18 -> {
                    games.add(GameTypes(it, "Играют все"))

                }
                19 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.img, R.drawable.subway_surf, "Subway-surf")
                        )

                    }
                    games.add(GameItem(it, game))
                }
                20 -> {
                    games.add(GameTypes(it, "Онлайн игры"))

                }
                21 -> {
                    repeat(10) { i ->
                        game.add(
                            Game(i, R.drawable.fifa2015_1, R.drawable.fifa2015_icon, "FIFA 2015")
                        )

                    }
                    games.add(GameItem(it, game))
                }
                22 -> {
                    repeat(10) {i->
                        rek.add(
                            Reklama(
                                i,
                                "Последние новости сегодня",
                                R.drawable.xorvatiya,
                                "Узнайте больше"
                            )
                        )
                    }
                    games.add(RvRek(it, rek))
                }


            }





            rvAdapter.models = games
        }
    }
}

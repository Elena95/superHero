package com.example.superhero.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.superhero.`data`.entities.SuperHero
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class PowerStatsFragmentArgs(
  public val superHero: SuperHero
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(SuperHero::class.java)) {
      result.putParcelable("superHero", this.superHero as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(SuperHero::class.java)) {
      result.putSerializable("superHero", this.superHero as Serializable)
    } else {
      throw UnsupportedOperationException(SuperHero::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PowerStatsFragmentArgs {
      bundle.setClassLoader(PowerStatsFragmentArgs::class.java.classLoader)
      val __superHero : SuperHero?
      if (bundle.containsKey("superHero")) {
        if (Parcelable::class.java.isAssignableFrom(SuperHero::class.java) ||
            Serializable::class.java.isAssignableFrom(SuperHero::class.java)) {
          __superHero = bundle.get("superHero") as SuperHero?
        } else {
          throw UnsupportedOperationException(SuperHero::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__superHero == null) {
          throw IllegalArgumentException("Argument \"superHero\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"superHero\" is missing and does not have an android:defaultValue")
      }
      return PowerStatsFragmentArgs(__superHero)
    }
  }
}

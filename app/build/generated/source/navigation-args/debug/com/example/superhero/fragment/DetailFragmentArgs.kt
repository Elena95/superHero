package com.example.superhero.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.superhero.`data`.entities.SuperHero
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val superHero: SuperHero,
  public val name: String
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
    result.putString("name", this.name)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
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
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__superHero, __name)
    }
  }
}

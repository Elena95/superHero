package com.example.superhero.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.superhero.R
import com.example.superhero.`data`.entities.SuperHero
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class DetailFragmentDirections private constructor() {
  private data class DetailFragmentFragmentToPowerstatsFragment(
    public val superHero: SuperHero
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.detail_fragmentFragment_to_powerstatsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun detailFragmentFragmentToPowerstatsFragment(superHero: SuperHero): NavDirections =
        DetailFragmentFragmentToPowerstatsFragment(superHero)
  }
}

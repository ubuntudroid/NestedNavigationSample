# Sample app demonstrating up navigation issues with nested fragments and the navigation components library

This app consists of one Activity and three main Fragments:

1. `MainFragment`
2. `OnboardingFragment`
3. `GameFragment`

The main navigation graph (`global_nav_graph.xml`) looks like this:

```
MainFragment -> OnboardingFragment -> GameFragment
```

The `OnboardingFragment` has two nested Fragments: `OnboardingFragmentStep1Fragment` and `OnboardingFragmentStep2Fragment`

However there are two problem with that:

## 1. Navigating up from OnboardingFragmentStep2

Likely caused by setting `app:defaultNavHost="true"` which in turn sets the nested nav host as the primary navigation
Fragment on the `OnboardingFragment`'s fragment manager.

That causes `FragmentManager.popBackStackImmediate()` to pop only the fragments in the nested host instead of the main
host. The toolbar however is in the right state (title "main_activity" without up arrow).

## 2. Navigate from nested fragment to global navigation

In step 2 of the onboarding we want to give the user the possibility to advance to the `GameFragment`. However: the
button for that resides in the nested NavHost which doesn't know about the `GameFragment` (see
`OnboardingFragmentStep2ViewModel`).

So how should we issue the navigation from there?
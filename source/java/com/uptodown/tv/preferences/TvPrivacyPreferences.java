package com.uptodown.tv.preferences;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import q4.q;
import w5.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TvPrivacyPreferences extends q {

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @StabilityInferred(parameters = 0)
    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public final void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.tv_privacy_preferences);
            Preference findPreference = findPreference("right_to_be_forgotten");
            findPreference.getClass();
            final int i = 0;
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: q5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f9971b;

                {
                    this.f9971b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i3 = i;
                    TvPrivacyPreferences.a aVar = this.f9971b;
                    switch (i3) {
                        case 0:
                            preference.getClass();
                            FragmentActivity requireActivity = aVar.requireActivity();
                            requireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(requireActivity, string, null);
                            return true;
                        case 1:
                            preference.getClass();
                            Context requireContext = aVar.requireContext();
                            requireContext.getClass();
                            s7.a.M(requireContext, "gdpr_requested", true);
                            Context requireContext2 = aVar.requireContext();
                            requireContext2.getClass();
                            s7.a.M(requireContext2, "gdpr_analytics_allowed", true);
                            Context requireContext3 = aVar.requireContext();
                            requireContext3.getClass();
                            s7.a.M(requireContext3, "gdpr_crashlytics_allowed", true);
                            Context requireContext4 = aVar.requireContext();
                            requireContext4.getClass();
                            s7.a.M(requireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            return true;
                        default:
                            preference.getClass();
                            Context requireContext5 = aVar.requireContext();
                            requireContext5.getClass();
                            s7.a.M(requireContext5, "gdpr_requested", false);
                            Context requireContext6 = aVar.requireContext();
                            requireContext6.getClass();
                            s7.a.M(requireContext6, "gdpr_analytics_allowed", false);
                            Context requireContext7 = aVar.requireContext();
                            requireContext7.getClass();
                            s7.a.M(requireContext7, "gdpr_crashlytics_allowed", false);
                            Context requireContext8 = aVar.requireContext();
                            requireContext8.getClass();
                            s7.a.M(requireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            return true;
                    }
                }
            });
            Preference findPreference2 = findPreference("privacy_accept_all");
            findPreference2.getClass();
            final int i3 = 1;
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: q5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f9971b;

                {
                    this.f9971b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i32 = i3;
                    TvPrivacyPreferences.a aVar = this.f9971b;
                    switch (i32) {
                        case 0:
                            preference.getClass();
                            FragmentActivity requireActivity = aVar.requireActivity();
                            requireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(requireActivity, string, null);
                            return true;
                        case 1:
                            preference.getClass();
                            Context requireContext = aVar.requireContext();
                            requireContext.getClass();
                            s7.a.M(requireContext, "gdpr_requested", true);
                            Context requireContext2 = aVar.requireContext();
                            requireContext2.getClass();
                            s7.a.M(requireContext2, "gdpr_analytics_allowed", true);
                            Context requireContext3 = aVar.requireContext();
                            requireContext3.getClass();
                            s7.a.M(requireContext3, "gdpr_crashlytics_allowed", true);
                            Context requireContext4 = aVar.requireContext();
                            requireContext4.getClass();
                            s7.a.M(requireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            return true;
                        default:
                            preference.getClass();
                            Context requireContext5 = aVar.requireContext();
                            requireContext5.getClass();
                            s7.a.M(requireContext5, "gdpr_requested", false);
                            Context requireContext6 = aVar.requireContext();
                            requireContext6.getClass();
                            s7.a.M(requireContext6, "gdpr_analytics_allowed", false);
                            Context requireContext7 = aVar.requireContext();
                            requireContext7.getClass();
                            s7.a.M(requireContext7, "gdpr_crashlytics_allowed", false);
                            Context requireContext8 = aVar.requireContext();
                            requireContext8.getClass();
                            s7.a.M(requireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            return true;
                    }
                }
            });
            Preference findPreference3 = findPreference("privacy_decline_all");
            findPreference3.getClass();
            final int i8 = 2;
            findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: q5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f9971b;

                {
                    this.f9971b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i32 = i8;
                    TvPrivacyPreferences.a aVar = this.f9971b;
                    switch (i32) {
                        case 0:
                            preference.getClass();
                            FragmentActivity requireActivity = aVar.requireActivity();
                            requireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(requireActivity, string, null);
                            return true;
                        case 1:
                            preference.getClass();
                            Context requireContext = aVar.requireContext();
                            requireContext.getClass();
                            s7.a.M(requireContext, "gdpr_requested", true);
                            Context requireContext2 = aVar.requireContext();
                            requireContext2.getClass();
                            s7.a.M(requireContext2, "gdpr_analytics_allowed", true);
                            Context requireContext3 = aVar.requireContext();
                            requireContext3.getClass();
                            s7.a.M(requireContext3, "gdpr_crashlytics_allowed", true);
                            Context requireContext4 = aVar.requireContext();
                            requireContext4.getClass();
                            s7.a.M(requireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            return true;
                        default:
                            preference.getClass();
                            Context requireContext5 = aVar.requireContext();
                            requireContext5.getClass();
                            s7.a.M(requireContext5, "gdpr_requested", false);
                            Context requireContext6 = aVar.requireContext();
                            requireContext6.getClass();
                            s7.a.M(requireContext6, "gdpr_analytics_allowed", false);
                            Context requireContext7 = aVar.requireContext();
                            requireContext7.getClass();
                            s7.a.M(requireContext7, "gdpr_crashlytics_allowed", false);
                            Context requireContext8 = aVar.requireContext();
                            requireContext8.getClass();
                            s7.a.M(requireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            return true;
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}

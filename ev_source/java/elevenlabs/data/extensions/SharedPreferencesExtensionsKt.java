package io.elevenlabs.data.extensions;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ho.p;
import ir.i;
import ir.r;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import oo.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aI\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0017\u001a1\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u0019\u001a5\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {TokenNames.T, "Landroid/content/SharedPreferences;", "", "observedKey", "Lkotlin/Function2;", "Lwn/c;", "", "getValue", "Lir/i;", "observe", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lho/p;)Lir/i;", "", "observedKeys", "observeKeys", "(Landroid/content/SharedPreferences;Ljava/util/Set;Lho/p;)Lir/i;", "sharedPreferences", SubscriberAttributeKt.JSON_NAME_KEY, "", "default", "Lko/b;", "sharedPreferencesProperty", "(Landroid/content/SharedPreferences;Ljava/lang/String;J)Lko/b;", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;I)Lko/b;", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Lko/b;", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Lko/b;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SharedPreferencesExtensionsKt {
    public static final <T> i observe(SharedPreferences sharedPreferences, String str, p pVar) {
        sharedPreferences.getClass();
        str.getClass();
        pVar.getClass();
        return r.j(new SharedPreferencesExtensionsKt$observe$1(pVar, sharedPreferences, str, null));
    }

    public static final <T> i observeKeys(SharedPreferences sharedPreferences, Set<String> set, p pVar) {
        sharedPreferences.getClass();
        set.getClass();
        pVar.getClass();
        return r.j(new SharedPreferencesExtensionsKt$observeKeys$1(pVar, sharedPreferences, set, null));
    }

    public static final ko.b sharedPreferencesProperty(final SharedPreferences sharedPreferences, final String str, final long j4) {
        sharedPreferences.getClass();
        str.getClass();
        return new ko.b() { // from class: io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$sharedPreferencesProperty$1
            @Override // ko.a
            public Long getValue(Object thisRef, u property) {
                thisRef.getClass();
                property.getClass();
                return Long.valueOf(sharedPreferences.getLong(str, j4));
            }

            public void setValue(Object thisRef, u property, long value) {
                thisRef.getClass();
                property.getClass();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                String str2 = str;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putLong(str2, value);
                edit.apply();
            }

            @Override // ko.b
            public /* bridge */ /* synthetic */ void setValue(Object obj, u uVar, Object obj2) {
                setValue(obj, uVar, ((Number) obj2).longValue());
            }
        };
    }

    public static final ko.b sharedPreferencesProperty(final SharedPreferences sharedPreferences, final String str, final int i10) {
        sharedPreferences.getClass();
        str.getClass();
        return new ko.b() { // from class: io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$sharedPreferencesProperty$2
            @Override // ko.a
            public Integer getValue(Object thisRef, u property) {
                thisRef.getClass();
                property.getClass();
                return Integer.valueOf(sharedPreferences.getInt(str, i10));
            }

            public void setValue(Object thisRef, u property, int value) {
                thisRef.getClass();
                property.getClass();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                String str2 = str;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putInt(str2, value);
                edit.apply();
            }

            @Override // ko.b
            public /* bridge */ /* synthetic */ void setValue(Object obj, u uVar, Object obj2) {
                setValue(obj, uVar, ((Number) obj2).intValue());
            }
        };
    }

    public static final ko.b sharedPreferencesProperty(final SharedPreferences sharedPreferences, final String str, final boolean z6) {
        sharedPreferences.getClass();
        str.getClass();
        return new ko.b() { // from class: io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$sharedPreferencesProperty$3
            @Override // ko.a
            public Boolean getValue(Object thisRef, u property) {
                thisRef.getClass();
                property.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean(str, z6));
            }

            public void setValue(Object thisRef, u property, boolean value) {
                thisRef.getClass();
                property.getClass();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                String str2 = str;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putBoolean(str2, value);
                edit.apply();
            }

            @Override // ko.b
            public /* bridge */ /* synthetic */ void setValue(Object obj, u uVar, Object obj2) {
                setValue(obj, uVar, ((Boolean) obj2).booleanValue());
            }
        };
    }

    public static final ko.b sharedPreferencesProperty(final SharedPreferences sharedPreferences, final String str, final String str2) {
        sharedPreferences.getClass();
        str.getClass();
        return new ko.b() { // from class: io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$sharedPreferencesProperty$4
            @Override // ko.a
            public String getValue(Object thisRef, u property) {
                thisRef.getClass();
                property.getClass();
                return sharedPreferences.getString(str, str2);
            }

            @Override // ko.b
            public void setValue(Object thisRef, u property, String value) {
                thisRef.getClass();
                property.getClass();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                String str3 = str;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putString(str3, value);
                edit.apply();
            }
        };
    }
}

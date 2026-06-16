package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/services/RuntimePermissionsServiceImpl;", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "permission", "", "hasAskedForPermissionBefore", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "askedForPermission", "Landroid/content/SharedPreferences;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RuntimePermissionsServiceImpl implements RuntimePermissionsService {
    private final SharedPreferences sharedPreferences;

    public RuntimePermissionsServiceImpl(@GlobalSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    @Override // io.elevenlabs.domain.services.RuntimePermissionsService
    public Object askedForPermission(String str, wn.c<? super z> cVar) {
        this.sharedPreferences.edit().putBoolean("has_asked_for_permission_" + str, true).apply();
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.RuntimePermissionsService
    public Object hasAskedForPermissionBefore(String str, wn.c<? super Boolean> cVar) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean("has_asked_for_permission_" + str, false));
    }
}

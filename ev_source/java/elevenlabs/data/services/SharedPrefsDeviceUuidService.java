package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.services.DeviceUuidService;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import oo.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR/\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/services/SharedPrefsDeviceUuidService;", "Lio/elevenlabs/domain/services/DeviceUuidService;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "getUuid", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "<set-?>", "savedUuid$delegate", "Lko/b;", "getSavedUuid", "setSavedUuid", "(Ljava/lang/String;)V", "savedUuid", "Ljava/util/concurrent/locks/ReentrantLock;", "writeLock", "Ljava/util/concurrent/locks/ReentrantLock;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SharedPrefsDeviceUuidService implements DeviceUuidService {
    static final /* synthetic */ u[] $$delegatedProperties = {new q(SharedPrefsDeviceUuidService.class, "savedUuid", "getSavedUuid()Ljava/lang/String;", 0)};

    /* renamed from: savedUuid$delegate, reason: from kotlin metadata */
    private final ko.b savedUuid;
    private final SharedPreferences sharedPreferences;
    private final ReentrantLock writeLock;

    public SharedPrefsDeviceUuidService(@GlobalSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        this.savedUuid = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "device_uuid", (String) null);
        this.writeLock = new ReentrantLock();
    }

    private final String getSavedUuid() {
        return (String) this.savedUuid.getValue(this, $$delegatedProperties[0]);
    }

    private final void setSavedUuid(String str) {
        this.savedUuid.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // io.elevenlabs.domain.services.DeviceUuidService
    public String getUuid() {
        String savedUuid = getSavedUuid();
        if (savedUuid != null) {
            return savedUuid;
        }
        ReentrantLock reentrantLock = this.writeLock;
        reentrantLock.lock();
        try {
            String savedUuid2 = getSavedUuid();
            if (savedUuid2 == null) {
                savedUuid2 = UUID.randomUUID().toString();
                setSavedUuid(savedUuid2);
            }
            return savedUuid2;
        } finally {
            reentrantLock.unlock();
        }
    }
}

package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UserConfigRequest;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fH¦@¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/UserConfigService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/UserConfig;", "getConfig", "()Lir/i;", "Lio/elevenlabs/domain/model/UserConfigRequest;", "configRequest", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "save", "(Lio/elevenlabs/domain/model/UserConfigRequest;Lwn/c;)Ljava/lang/Object;", "saveAsync", "syncPendingChanges", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface UserConfigService {
    i getConfig();

    Object save(UserConfigRequest userConfigRequest, c<? super AsyncCallResult<z>> cVar);

    Object saveAsync(UserConfigRequest userConfigRequest, c<? super z> cVar);

    Object sync(c<? super i> cVar);

    Object syncPendingChanges(c<? super z> cVar);
}

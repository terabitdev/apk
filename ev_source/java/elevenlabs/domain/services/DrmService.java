package io.elevenlabs.domain.services;

import a9.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/DrmService;", "", "", "readId", "fileNumber", "Lio/elevenlabs/domain/services/LicenseType;", "licenseType", "Lio/elevenlabs/domain/services/DrmToken;", "getDrmToken", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/services/LicenseType;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface DrmService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getDrmToken$default(DrmService drmService, String str, String str2, LicenseType licenseType, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                licenseType = LicenseType.STREAMING;
            }
            return drmService.getDrmToken(str, str2, licenseType, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getDrmToken");
        return null;
    }

    Object getDrmToken(String str, String str2, LicenseType licenseType, c<? super DrmToken> cVar);
}

package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.SoundscapesAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.ReaderSoundscape;
import io.elevenlabs.data.model.response.GetSoundscapesResponse;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.SoundscapesService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/data/services/SoundscapesServiceImpl;", "Lio/elevenlabs/domain/services/SoundscapesService;", "Lio/elevenlabs/data/api/SoundscapesAPI;", "soundscapesAPI", "Lio/elevenlabs/data/services/SoundscapeDownloader;", "soundscapeDownloader", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/SoundscapesAPI;Lio/elevenlabs/data/services/SoundscapeDownloader;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/Soundscape;", "getSoundscapes", "(Lwn/c;)Ljava/lang/Object;", "soundscape", "Lir/i;", "Lio/elevenlabs/domain/services/SoundscapeDownloadState;", "downloadSoundscape", "(Lio/elevenlabs/domain/model/Soundscape;)Lir/i;", "", "isCached", "(Lio/elevenlabs/domain/model/Soundscape;)Z", "Lio/elevenlabs/data/api/SoundscapesAPI;", "Lio/elevenlabs/data/services/SoundscapeDownloader;", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SoundscapesServiceImpl implements SoundscapesService {
    private static final String TAG = "SoundscapesService";
    private final Logger logger;
    private final SoundscapeDownloader soundscapeDownloader;
    private final SoundscapesAPI soundscapesAPI;

    public SoundscapesServiceImpl(SoundscapesAPI soundscapesAPI, SoundscapeDownloader soundscapeDownloader, Logger logger) {
        soundscapesAPI.getClass();
        soundscapeDownloader.getClass();
        logger.getClass();
        this.soundscapesAPI = soundscapesAPI;
        this.soundscapeDownloader = soundscapeDownloader;
        this.logger = logger;
    }

    public static /* synthetic */ List a(GetSoundscapesResponse getSoundscapesResponse) {
        return getSoundscapes$lambda$0(getSoundscapesResponse);
    }

    public static final List getSoundscapes$lambda$0(GetSoundscapesResponse getSoundscapesResponse) {
        Soundscape domain;
        getSoundscapesResponse.getClass();
        List<ReaderSoundscape> soundscapes = getSoundscapesResponse.getSoundscapes();
        ArrayList arrayList = new ArrayList(p.a0(soundscapes, 10));
        Iterator<T> it = soundscapes.iterator();
        while (it.hasNext()) {
            domain = SoundscapesServiceImplKt.toDomain((ReaderSoundscape) it.next());
            arrayList.add(domain);
        }
        return arrayList;
    }

    @Override // io.elevenlabs.domain.services.SoundscapesService
    public ir.i downloadSoundscape(Soundscape soundscape) {
        soundscape.getClass();
        return this.soundscapeDownloader.downloadSoundscape(soundscape);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.SoundscapesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSoundscapes(wn.c<? super AsyncCallResult<List<Soundscape>>> cVar) {
        SoundscapesServiceImpl$getSoundscapes$1 soundscapesServiceImpl$getSoundscapes$1;
        int i10;
        try {
            if (cVar instanceof SoundscapesServiceImpl$getSoundscapes$1) {
                soundscapesServiceImpl$getSoundscapes$1 = (SoundscapesServiceImpl$getSoundscapes$1) cVar;
                int i11 = soundscapesServiceImpl$getSoundscapes$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    soundscapesServiceImpl$getSoundscapes$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = soundscapesServiceImpl$getSoundscapes$1.result;
                    i10 = soundscapesServiceImpl$getSoundscapes$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        SoundscapesAPI soundscapesAPI = this.soundscapesAPI;
                        soundscapesServiceImpl$getSoundscapes$1.label = 1;
                        obj = SoundscapesAPI.getSoundscapes$default(soundscapesAPI, 0, soundscapesServiceImpl$getSoundscapes$1, 1, null);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(6));
                }
            }
            if (i10 == 0) {
            }
            return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(6));
        } catch (Exception e10) {
            this.logger.logError(TAG, "Failed to fetch soundscapes", e10);
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
        soundscapesServiceImpl$getSoundscapes$1 = new SoundscapesServiceImpl$getSoundscapes$1(this, cVar);
        Object obj2 = soundscapesServiceImpl$getSoundscapes$1.result;
        i10 = soundscapesServiceImpl$getSoundscapes$1.label;
    }

    @Override // io.elevenlabs.domain.services.SoundscapesService
    public boolean isCached(Soundscape soundscape) {
        soundscape.getClass();
        return this.soundscapeDownloader.isCached(soundscape);
    }
}

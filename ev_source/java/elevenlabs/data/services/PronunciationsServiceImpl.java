package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import fr.d0;
import fr.g0;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.model.response.PronunciationResponse;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.PronunciationsService;
import ir.j1;
import ir.l1;
import ir.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u001d\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\"0!H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b%\u0010\u0012J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b(\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\"0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/elevenlabs/data/services/PronunciationsServiceImpl;", "Lio/elevenlabs/domain/services/PronunciationsService;", "Lio/elevenlabs/data/api/PronunciationsAPI;", "pronunciationsApi", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lfr/d0;", "scope", "<init>", "(Lio/elevenlabs/data/api/PronunciationsAPI;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;Lfr/d0;)V", "Lsn/z;", "refreshPronunciationsInternal", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/PronunciationResponse;", "Lio/elevenlabs/domain/model/Pronunciation;", "toDomainModel", "(Lio/elevenlabs/data/model/response/PronunciationResponse;)Lio/elevenlabs/domain/model/Pronunciation;", "", "originalText", "spokenText", "Lio/elevenlabs/domain/model/AsyncCallResult;", "createPronunciation", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "id", "updatePronunciation", "deletePronunciation", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "", "observePronunciations", "()Lir/i;", "refreshPronunciations", ParameterNames.TEXT, "voiceId", "generatePreviewUrl", "Lio/elevenlabs/data/api/PronunciationsAPI;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lfr/d0;", "Lir/j1;", "pronunciationsFlow", "Lir/j1;", "", "previewCache", "Ljava/util/Map;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PronunciationsServiceImpl implements PronunciationsService {
    private static final String TAG = "PronunciationsService";
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final Map<String, String> previewCache;
    private final PronunciationsAPI pronunciationsApi;
    private final j1 pronunciationsFlow;
    private final d0 scope;

    public PronunciationsServiceImpl(PronunciationsAPI pronunciationsAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger, DispatcherFactory dispatcherFactory, @ApplicationCoroutineScope d0 d0Var) {
        pronunciationsAPI.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        d0Var.getClass();
        this.pronunciationsApi = pronunciationsAPI;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.logger = logger;
        this.dispatcherFactory = dispatcherFactory;
        this.scope = d0Var;
        this.pronunciationsFlow = r.c(t.f33547a);
        this.previewCache = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshPronunciationsInternal(wn.c<? super z> cVar) {
        Object join = g0.D(this.scope, null, null, new PronunciationsServiceImpl$refreshPronunciationsInternal$2(this, null), 3).join(cVar);
        if (join == xn.a.f37986a) {
            return join;
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pronunciation toDomainModel(PronunciationResponse pronunciationResponse) {
        return new Pronunciation(pronunciationResponse.getId(), pronunciationResponse.getOriginalText(), pronunciationResponse.getSpokenText(), pronunciationResponse.getCreatedAtUnix(), pronunciationResponse.getUpdatedAtUnix());
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public Object createPronunciation(String str, String str2, wn.c<? super AsyncCallResult<Pronunciation>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new PronunciationsServiceImpl$createPronunciation$2(str, str2, this, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public Object deletePronunciation(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new PronunciationsServiceImpl$deletePronunciation$2(this, str, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public Object generatePreviewUrl(String str, String str2, wn.c<? super AsyncCallResult<String>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new PronunciationsServiceImpl$generatePreviewUrl$2(str, str2, this, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public ir.i observePronunciations() {
        return new l1(this.pronunciationsFlow);
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public Object refreshPronunciations(wn.c<? super z> cVar) {
        Object Q = g0.Q(this.dispatcherFactory.getIo(), new PronunciationsServiceImpl$refreshPronunciations$2(this, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.PronunciationsService
    public Object updatePronunciation(String str, String str2, wn.c<? super AsyncCallResult<Pronunciation>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new PronunciationsServiceImpl$updatePronunciation$2(str2, this, str, null), cVar);
    }
}

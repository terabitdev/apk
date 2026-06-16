package io.elevenlabs.data.services;

import a7.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.u0;
import com.google.protobuf.c6;
import fr.d0;
import fr.e0;
import fr.g0;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.database.entities.voices.VoiceEntity;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderVoicesResponseModel;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.VoicesService;
import ir.k1;
import ir.m1;
import ir.q1;
import ir.r;
import ir.t1;
import ir.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;
import uf.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001KBo\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020!0&H\u0016¢\u0006\u0004\b'\u0010(J\"\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0)0&H\u0096@¢\u0006\u0004\b+\u0010,J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0)2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b.\u0010%J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020#0)2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b/\u0010%J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000&H\u0016¢\u0006\u0004\b1\u0010(J\u001b\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001d0&H\u0016¢\u0006\u0004\b2\u0010(J$\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0)0&2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b3\u0010%J\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002040&2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b5\u0010%J.\u0010:\u001a\b\u0012\u0004\u0012\u00020!0)2\u0006\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020!2\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010GR\u0014\u0010H\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010I¨\u0006L"}, d2 = {"Lio/elevenlabs/data/services/VoicesServiceImpl;", "Lio/elevenlabs/domain/services/VoicesService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/data/api/VoicesAPI;", "voicesAPI", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "voicesDao", "Lio/elevenlabs/domain/Logger;", "logger", "Landroid/content/SharedPreferences;", "userSharedPreferences", "Lio/elevenlabs/domain/services/AppConfigService;", "appConfigService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lfr/d0;", "coroutineScope", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "<init>", "(Landroid/content/Context;Lio/elevenlabs/data/api/VoicesAPI;Lio/elevenlabs/data/database/entities/voices/VoicesDao;Lio/elevenlabs/domain/Logger;Landroid/content/SharedPreferences;Lio/elevenlabs/domain/services/AppConfigService;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Analytics;Lfr/d0;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;)V", "Lio/elevenlabs/data/model/response/ReaderVoicesResponseModel;", "", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "transform", "(Lio/elevenlabs/data/model/response/ReaderVoicesResponseModel;)Ljava/util/List;", "", "id", "Lsn/z;", "setDefaultVoice", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "defaultVoiceId", "()Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/VoiceSection;", "getVoicesHome", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/Voice;", "addVoice", "removeVoice", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "voices", "getVoice", "", "isSaved", "voiceId", "readId", "", "charOffset", "getContextualPreviewUrl", "(Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/data/api/VoicesAPI;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/domain/Logger;", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/services/AppConfigService;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Analytics;", "Lfr/d0;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", ParameterNames.TAG, "Ljava/lang/String;", "prefDefaultVoiceId", "VoicesSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoicesServiceImpl implements VoicesService {
    private final Analytics analytics;
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final AppConfigService appConfigService;
    private final ConnectivityService connectivityService;
    private final Context context;
    private final d0 coroutineScope;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final String prefDefaultVoiceId;
    private final String tag;
    private final SharedPreferences userSharedPreferences;
    private final VoicesAPI voicesAPI;
    private final VoicesDao voicesDao;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/VoicesServiceImpl$VoicesSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class VoicesSyncException extends Exception {
    }

    public VoicesServiceImpl(Context context, VoicesAPI voicesAPI, VoicesDao voicesDao, Logger logger, @UserSharedPreferences SharedPreferences sharedPreferences, AppConfigService appConfigService, DispatcherFactory dispatcherFactory, Analytics analytics, @ApplicationCoroutineScope d0 d0Var, ConnectivityService connectivityService, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService) {
        context.getClass();
        voicesAPI.getClass();
        voicesDao.getClass();
        logger.getClass();
        sharedPreferences.getClass();
        appConfigService.getClass();
        dispatcherFactory.getClass();
        analytics.getClass();
        d0Var.getClass();
        connectivityService.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        this.context = context;
        this.voicesAPI = voicesAPI;
        this.voicesDao = voicesDao;
        this.logger = logger;
        this.userSharedPreferences = sharedPreferences;
        this.appConfigService = appConfigService;
        this.dispatcherFactory = dispatcherFactory;
        this.analytics = analytics;
        this.coroutineScope = d0Var;
        this.connectivityService = connectivityService;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.tag = "VoicesService";
        this.prefDefaultVoiceId = "DEFAULT_VOICE_ID";
    }

    public static /* synthetic */ Voice a(VoiceItemResponseModel voiceItemResponseModel) {
        return addVoice$lambda$0(voiceItemResponseModel);
    }

    public static final Voice addVoice$lambda$0(VoiceItemResponseModel voiceItemResponseModel) {
        voiceItemResponseModel.getClass();
        return VoiceMappingKt.toDomain(voiceItemResponseModel);
    }

    public final List<VoiceEntity> transform(ReaderVoicesResponseModel readerVoicesResponseModel) {
        List<VoiceItemResponseModel> voices = readerVoicesResponseModel.getVoices();
        ArrayList arrayList = new ArrayList(p.a0(voices, 10));
        Iterator<T> it = voices.iterator();
        while (it.hasNext()) {
            arrayList.add(VoiceMappingKt.toEntity((VoiceItemResponseModel) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.VoicesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addVoice(String str, wn.c<? super AsyncCallResult<Voice>> cVar) {
        VoicesServiceImpl$addVoice$1 voicesServiceImpl$addVoice$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof VoicesServiceImpl$addVoice$1) {
            voicesServiceImpl$addVoice$1 = (VoicesServiceImpl$addVoice$1) cVar;
            int i11 = voicesServiceImpl$addVoice$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voicesServiceImpl$addVoice$1.label = i11 - Integer.MIN_VALUE;
                Object obj = voicesServiceImpl$addVoice$1.result;
                i10 = voicesServiceImpl$addVoice$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("Adding a voice - ", str, this.logger, this.tag);
                    VoicesAPI voicesAPI = this.voicesAPI;
                    voicesServiceImpl$addVoice$1.L$0 = null;
                    voicesServiceImpl$addVoice$1.label = 1;
                    obj = voicesAPI.addVoice(str, voicesServiceImpl$addVoice$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    this.voicesDao.insert(VoiceMappingKt.toEntity((VoiceItemResponseModel) ((ApiResult.Success) apiResult).getData()));
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new h(9));
            }
        }
        voicesServiceImpl$addVoice$1 = new VoicesServiceImpl$addVoice$1(this, cVar);
        Object obj2 = voicesServiceImpl$addVoice$1.result;
        i10 = voicesServiceImpl$addVoice$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new h(9));
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public ir.i defaultVoiceId() {
        return SharedPreferencesExtensionsKt.observe(this.userSharedPreferences, this.prefDefaultVoiceId, new VoicesServiceImpl$defaultVoiceId$1(this, null));
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public Object getContextualPreviewUrl(String str, String str2, long j4, wn.c<? super AsyncCallResult<String>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new VoicesServiceImpl$getContextualPreviewUrl$2(str, str2, j4, this, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.VoicesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getVoice(String str, wn.c<? super ir.i> cVar) {
        VoicesServiceImpl$getVoice$1 voicesServiceImpl$getVoice$1;
        int i10;
        VoiceEntity voiceEntity;
        if (cVar instanceof VoicesServiceImpl$getVoice$1) {
            voicesServiceImpl$getVoice$1 = (VoicesServiceImpl$getVoice$1) cVar;
            int i11 = voicesServiceImpl$getVoice$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voicesServiceImpl$getVoice$1.label = i11 - Integer.MIN_VALUE;
                Object obj = voicesServiceImpl$getVoice$1.result;
                i10 = voicesServiceImpl$getVoice$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = (String) voicesServiceImpl$getVoice$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ir.i byId = this.voicesDao.getById(str);
                    voicesServiceImpl$getVoice$1.L$0 = str;
                    voicesServiceImpl$getVoice$1.label = 1;
                    obj = r.u(byId, voicesServiceImpl$getVoice$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                voiceEntity = (VoiceEntity) obj;
                if (voiceEntity == null) {
                    return new u(new AsyncCallResult.Success(VoiceMappingKt.toDomain(voiceEntity)), 3);
                }
                final m1 m1Var = new m1(new VoicesServiceImpl$getVoice$2(this, str, null));
                return new ir.i() { // from class: io.elevenlabs.data.services.VoicesServiceImpl$getVoice$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$getVoice$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$getVoice$$inlined$map$1$2", f = "VoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$getVoice$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), VoicesServiceImpl$getVoice$3$1.INSTANCE);
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(map, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar2) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
            }
        }
        voicesServiceImpl$getVoice$1 = new VoicesServiceImpl$getVoice$1(this, cVar);
        Object obj2 = voicesServiceImpl$getVoice$1.result;
        i10 = voicesServiceImpl$getVoice$1.label;
        if (i10 == 0) {
        }
        voiceEntity = (VoiceEntity) obj2;
        if (voiceEntity == null) {
        }
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public Object getVoicesHome(wn.c<? super ir.i> cVar) {
        final m1 m1Var = new m1(new VoicesServiceImpl$getVoicesHome$2(this, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.VoicesServiceImpl$getVoicesHome$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$getVoicesHome$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$getVoicesHome$$inlined$map$1$2", f = "VoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$getVoicesHome$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), VoicesServiceImpl$getVoicesHome$3$1.INSTANCE);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(map, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public Object isSaved(String str, wn.c<? super ir.i> cVar) {
        final ir.i byId = this.voicesDao.getById(str);
        return new ir.i() { // from class: io.elevenlabs.data.services.VoicesServiceImpl$isSaved$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$isSaved$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$isSaved$$inlined$map$1$2", f = "VoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$isSaved$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z6;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                if (((VoiceEntity) obj) != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (r11 == r8) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r11 != r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r11 == r8) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.elevenlabs.domain.services.VoicesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeVoice(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        VoicesServiceImpl$removeVoice$1 voicesServiceImpl$removeVoice$1;
        Object obj;
        int i10;
        String str2;
        VoicesServiceImpl voicesServiceImpl;
        String defaultVoice;
        if (cVar instanceof VoicesServiceImpl$removeVoice$1) {
            voicesServiceImpl$removeVoice$1 = (VoicesServiceImpl$removeVoice$1) cVar;
            int i11 = voicesServiceImpl$removeVoice$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voicesServiceImpl$removeVoice$1.label = i11 - Integer.MIN_VALUE;
                obj = voicesServiceImpl$removeVoice$1.result;
                i10 = voicesServiceImpl$removeVoice$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        sn.a.g(obj);
                                        return ApiResultExtensionKt.toDomain((ApiResult) obj);
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str = (String) voicesServiceImpl$removeVoice$1.L$0;
                                sn.a.g(obj);
                                VoiceEntity voiceEntity = (VoiceEntity) obj;
                                if (voiceEntity != null) {
                                    this.voicesDao.delete(voiceEntity);
                                }
                                VoicesAPI voicesAPI = this.voicesAPI;
                                voicesServiceImpl$removeVoice$1.L$0 = null;
                                voicesServiceImpl$removeVoice$1.label = 5;
                                obj = voicesAPI.deleteVoice(str, voicesServiceImpl$removeVoice$1);
                            } else {
                                str = (String) voicesServiceImpl$removeVoice$1.L$0;
                                sn.a.g(obj);
                                ir.i byId = this.voicesDao.getById(str);
                                voicesServiceImpl$removeVoice$1.L$0 = str;
                                voicesServiceImpl$removeVoice$1.label = 4;
                                obj = r.u(byId, voicesServiceImpl$removeVoice$1);
                            }
                        } else {
                            voicesServiceImpl = (VoicesServiceImpl) voicesServiceImpl$removeVoice$1.L$1;
                            str2 = (String) voicesServiceImpl$removeVoice$1.L$0;
                            sn.a.g(obj);
                            defaultVoice = ((AppConfig) obj).getDefaultVoice();
                            voicesServiceImpl$removeVoice$1.L$0 = str2;
                            voicesServiceImpl$removeVoice$1.L$1 = null;
                            voicesServiceImpl$removeVoice$1.label = 3;
                            if (voicesServiceImpl.setDefaultVoice(defaultVoice, voicesServiceImpl$removeVoice$1) != aVar) {
                                str = str2;
                                ir.i byId2 = this.voicesDao.getById(str);
                                voicesServiceImpl$removeVoice$1.L$0 = str;
                                voicesServiceImpl$removeVoice$1.label = 4;
                                obj = r.u(byId2, voicesServiceImpl$removeVoice$1);
                            }
                            return aVar;
                        }
                    } else {
                        str = (String) voicesServiceImpl$removeVoice$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ir.i defaultVoiceId = defaultVoiceId();
                    voicesServiceImpl$removeVoice$1.L$0 = str;
                    voicesServiceImpl$removeVoice$1.label = 1;
                    obj = r.u(defaultVoiceId, voicesServiceImpl$removeVoice$1);
                }
                if (m.c(obj, str)) {
                    ir.i config = this.appConfigService.getConfig();
                    voicesServiceImpl$removeVoice$1.L$0 = str;
                    voicesServiceImpl$removeVoice$1.L$1 = this;
                    voicesServiceImpl$removeVoice$1.label = 2;
                    obj = r.u(config, voicesServiceImpl$removeVoice$1);
                    if (obj != aVar) {
                        str2 = str;
                        voicesServiceImpl = this;
                        defaultVoice = ((AppConfig) obj).getDefaultVoice();
                        voicesServiceImpl$removeVoice$1.L$0 = str2;
                        voicesServiceImpl$removeVoice$1.L$1 = null;
                        voicesServiceImpl$removeVoice$1.label = 3;
                        if (voicesServiceImpl.setDefaultVoice(defaultVoice, voicesServiceImpl$removeVoice$1) != aVar) {
                        }
                    }
                    return aVar;
                }
                ir.i byId22 = this.voicesDao.getById(str);
                voicesServiceImpl$removeVoice$1.L$0 = str;
                voicesServiceImpl$removeVoice$1.label = 4;
                obj = r.u(byId22, voicesServiceImpl$removeVoice$1);
            }
        }
        voicesServiceImpl$removeVoice$1 = new VoicesServiceImpl$removeVoice$1(this, cVar);
        obj = voicesServiceImpl$removeVoice$1.result;
        i10 = voicesServiceImpl$removeVoice$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (m.c(obj, str)) {
        }
        ir.i byId222 = this.voicesDao.getById(str);
        voicesServiceImpl$removeVoice$1.L$0 = str;
        voicesServiceImpl$removeVoice$1.label = 4;
        obj = r.u(byId222, voicesServiceImpl$removeVoice$1);
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public Object setDefaultVoice(String str, wn.c<? super z> cVar) {
        this.analytics.log(Analytics.Event.PlayerUpdatedDefaultVoice.INSTANCE);
        if (this.userSharedPreferences.getString(this.prefDefaultVoiceId, null) == null) {
            this.analytics.log(Analytics.Event.VoicesSetDefaultVoice.INSTANCE);
        }
        this.userSharedPreferences.edit().putString(this.prefDefaultVoiceId, str).apply();
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public ir.i sync() {
        e0 e0Var;
        ir.e j4 = r.j(new VoicesServiceImpl$sync$1(this, null));
        kr.d F = g0.F(this.coroutineScope, this.dispatcherFactory.getDefault());
        y1 y1Var = new y1(2000L, Long.MAX_VALUE);
        n m10 = r.m(j4, 0);
        q1 a10 = r.a(0, m10.f34359a, (hr.a) m10.f34361c);
        wn.h hVar = (wn.h) m10.f34362d;
        ir.i iVar = (ir.i) m10.f34360b;
        com.google.gson.internal.e eVar = r.f18033c;
        if (y1Var.equals(t1.f18063a)) {
            e0Var = e0.f9812a;
        } else {
            e0Var = e0.f9815d;
        }
        g0.C(F, hVar, e0Var, new u0(y1Var, iVar, a10, eVar, (wn.c) null));
        return new k1(a10);
    }

    @Override // io.elevenlabs.domain.services.VoicesService
    public ir.i voices() {
        final ir.i all = this.voicesDao.getAll();
        return new ir.i() { // from class: io.elevenlabs.data.services.VoicesServiceImpl$voices$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$voices$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$voices$$inlined$map$1$2", f = "VoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$voices$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(VoiceMappingKt.toDomain((VoiceEntity) it.next()));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }
}

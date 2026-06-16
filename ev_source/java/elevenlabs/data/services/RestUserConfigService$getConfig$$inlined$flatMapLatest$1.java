package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.response.ReaderUserConfigResponseModel;
import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.UserConfig;
import ir.r;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$getConfig$$inlined$flatMapLatest$1", f = "RestUserConfigService.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RestUserConfigService$getConfig$$inlined$flatMapLatest$1 extends yn.i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RestUserConfigService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestUserConfigService$getConfig$$inlined$flatMapLatest$1(wn.c cVar, RestUserConfigService restUserConfigService) {
        super(3, cVar);
        this.this$0 = restUserConfigService;
    }

    public final Object invoke(ir.j jVar, UserConfig userConfig, wn.c<? super z> cVar) {
        RestUserConfigService$getConfig$$inlined$flatMapLatest$1 restUserConfigService$getConfig$$inlined$flatMapLatest$1 = new RestUserConfigService$getConfig$$inlined$flatMapLatest$1(cVar, this.this$0);
        restUserConfigService$getConfig$$inlined$flatMapLatest$1.L$0 = jVar;
        restUserConfigService$getConfig$$inlined$flatMapLatest$1.L$1 = userConfig;
        return restUserConfigService$getConfig$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        final ir.i pendingChanges;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ir.j jVar = (ir.j) this.L$0;
            final UserConfig userConfig = (UserConfig) this.L$1;
            pendingChanges = this.this$0.getPendingChanges();
            final RestUserConfigService restUserConfigService = this.this$0;
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.data.services.RestUserConfigService$getConfig$lambda$0$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.RestUserConfigService$getConfig$lambda$0$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ UserConfig $config$inlined;
                    final /* synthetic */ ir.j $this_unsafeFlow;
                    final /* synthetic */ RestUserConfigService this$0;

                    @yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$getConfig$lambda$0$$inlined$map$1$2", f = "RestUserConfigService.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.data.services.RestUserConfigService$getConfig$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(ir.j jVar, UserConfig userConfig, RestUserConfigService restUserConfigService) {
                        this.$this_unsafeFlow = jVar;
                        this.$config$inlined = userConfig;
                        this.this$0 = restUserConfigService;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
                    
                        if (r5 != null) goto L52;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
                    
                        if (r5 != null) goto L59;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
                    
                        if (r5 != null) goto L66;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        long dailyStreakMinutes;
                        Float playbackSpeedRate;
                        String genfmLanguage;
                        Boolean matureContentEnabled;
                        long fontSize;
                        PlayerFontFamily fontFamily;
                        PlayerTheme theme;
                        PlayerActionButton actionButton;
                        String storeCountryCode;
                        Long voiceAssistantTermsAgreedAt;
                        String playerActionButton;
                        Map map;
                        String playerTheme;
                        Map map2;
                        String playerFontFamily;
                        Map map3;
                        Long playerFontSize;
                        BigDecimalJson playbackSpeedRate2;
                        BigDecimal value;
                        Long dailyStreakMinutes2;
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
                                    ReaderUserConfigResponseModel readerUserConfigResponseModel = (ReaderUserConfigResponseModel) obj;
                                    if (readerUserConfigResponseModel != null && (dailyStreakMinutes2 = readerUserConfigResponseModel.getDailyStreakMinutes()) != null) {
                                        dailyStreakMinutes = dailyStreakMinutes2.longValue();
                                    } else {
                                        dailyStreakMinutes = this.$config$inlined.getDailyStreakMinutes();
                                    }
                                    long j4 = dailyStreakMinutes;
                                    if (readerUserConfigResponseModel != null && (playbackSpeedRate2 = readerUserConfigResponseModel.getPlaybackSpeedRate()) != null && (value = playbackSpeedRate2.getValue()) != null) {
                                        playbackSpeedRate = new Float(value.floatValue());
                                    } else {
                                        playbackSpeedRate = this.$config$inlined.getPlaybackSpeedRate();
                                    }
                                    Float f10 = playbackSpeedRate;
                                    if (readerUserConfigResponseModel == null || (genfmLanguage = readerUserConfigResponseModel.getGenfmLanguage()) == null) {
                                        genfmLanguage = this.$config$inlined.getGenfmLanguage();
                                    }
                                    String str = genfmLanguage;
                                    if (readerUserConfigResponseModel == null || (matureContentEnabled = readerUserConfigResponseModel.getMatureContentEnabled()) == null) {
                                        matureContentEnabled = this.$config$inlined.getMatureContentEnabled();
                                    }
                                    Boolean bool = matureContentEnabled;
                                    if (readerUserConfigResponseModel != null && (playerFontSize = readerUserConfigResponseModel.getPlayerFontSize()) != null) {
                                        fontSize = playerFontSize.longValue();
                                    } else {
                                        fontSize = this.$config$inlined.getPlayer().getFontSize();
                                    }
                                    long j10 = fontSize;
                                    if (readerUserConfigResponseModel != null && (playerFontFamily = readerUserConfigResponseModel.getPlayerFontFamily()) != null) {
                                        map3 = this.this$0.playerFontFamilyMap;
                                        fontFamily = (PlayerFontFamily) map3.get(playerFontFamily);
                                    }
                                    fontFamily = this.$config$inlined.getPlayer().getFontFamily();
                                    PlayerFontFamily playerFontFamily2 = fontFamily;
                                    if (readerUserConfigResponseModel != null && (playerTheme = readerUserConfigResponseModel.getPlayerTheme()) != null) {
                                        map2 = this.this$0.playerThemeMap;
                                        theme = (PlayerTheme) map2.get(playerTheme);
                                    }
                                    theme = this.$config$inlined.getPlayer().getTheme();
                                    PlayerTheme playerTheme2 = theme;
                                    if (readerUserConfigResponseModel != null && (playerActionButton = readerUserConfigResponseModel.getPlayerActionButton()) != null) {
                                        map = this.this$0.playerActionButtonMap;
                                        actionButton = (PlayerActionButton) map.get(playerActionButton);
                                    }
                                    actionButton = this.$config$inlined.getPlayer().getActionButton();
                                    UserConfig.PlayerConfig playerConfig = new UserConfig.PlayerConfig(j10, playerFontFamily2, playerTheme2, actionButton, this.$config$inlined.getPlayer().getDisplayMode());
                                    if (readerUserConfigResponseModel == null || (storeCountryCode = readerUserConfigResponseModel.getStoreCountryCode()) == null) {
                                        storeCountryCode = this.$config$inlined.getStoreCountryCode();
                                    }
                                    String str2 = storeCountryCode;
                                    Map<String, String> featureFlagVariants = this.$config$inlined.getFeatureFlagVariants();
                                    if (readerUserConfigResponseModel == null || (voiceAssistantTermsAgreedAt = readerUserConfigResponseModel.getVoiceAssistantTermsAgreedAtUnix()) == null) {
                                        voiceAssistantTermsAgreedAt = this.$config$inlined.getVoiceAssistantTermsAgreedAt();
                                    }
                                    UserConfig userConfig = new UserConfig(j4, f10, playerConfig, str, str2, bool, featureFlagVariants, voiceAssistantTermsAgreedAt);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(userConfig, anonymousClass1);
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
                public Object collect(ir.j jVar2, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar2, userConfig, restUserConfigService), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return z.f31622a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = r.r(jVar, iVar, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (UserConfig) obj2, (wn.c<? super z>) obj3);
    }
}

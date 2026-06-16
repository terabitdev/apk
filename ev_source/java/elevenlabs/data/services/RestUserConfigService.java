package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.BrowserExtensionConfig;
import io.elevenlabs.data.model.response.ReaderUserConfigResponseModel;
import io.elevenlabs.data.worker.SaveUserConfigWorker;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.a1;
import ir.r;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import tn.p;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001DB=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0014J\u0013\u0010\"\u001a\u00020\u0016*\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0015H\u0096@¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b'\u0010\u0018J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b,\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u00108\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010?\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020>0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R \u0010A\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020@0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R \u0010C\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020B0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=¨\u0006E"}, d2 = {"Lio/elevenlabs/data/services/RestUserConfigService;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/data/api/ConfigAPI;", "configAPI", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Landroid/content/Context;", "appContext", "<init>", "(Lio/elevenlabs/data/api/ConfigAPI;Landroid/content/SharedPreferences;Lvr/c;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/ConnectivityService;Landroid/content/Context;)V", "Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "result", "Lsn/z;", "saveConfig", "(Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;)V", "Lir/i;", "Lio/elevenlabs/domain/model/UserConfig;", "getSavedConfig", "()Lir/i;", "getPendingChanges", "getLastPendingChanges", "()Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "Lio/elevenlabs/domain/model/UserConfigRequest;", "configRequest", "buildPendingChanges", "(Lio/elevenlabs/domain/model/UserConfigRequest;)Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "pendingChanges", "savePendingChanges", "toDomain", "(Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;)Lio/elevenlabs/domain/model/UserConfig;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "(Lwn/c;)Ljava/lang/Object;", "getConfig", "Lio/elevenlabs/domain/model/AsyncCallResult;", "save", "(Lio/elevenlabs/domain/model/UserConfigRequest;Lwn/c;)Ljava/lang/Object;", "saveAsync", "syncPendingChanges", "Lio/elevenlabs/data/api/ConfigAPI;", "Landroid/content/SharedPreferences;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Landroid/content/Context;", "", ParameterNames.TAG, "Ljava/lang/String;", "prefConfig", "prefConfigPendingChanges", "emptyPendingChanges", "Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "", "Lio/elevenlabs/domain/model/PlayerFontFamily;", "playerFontFamilyMap", "Ljava/util/Map;", "Lio/elevenlabs/domain/model/PlayerTheme;", "playerThemeMap", "Lio/elevenlabs/domain/model/PlayerActionButton;", "playerActionButtonMap", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "playerDisplayModeMap", "UserConfigSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestUserConfigService implements UserConfigService {
    private final Context appContext;
    private final ConfigAPI configAPI;
    private final ConnectivityService connectivityService;
    private final ReaderUserConfigResponseModel emptyPendingChanges;
    private final vr.c json;
    private final Logger logger;
    private final Map<String, PlayerActionButton> playerActionButtonMap;
    private final Map<String, PlayerDisplayMode> playerDisplayModeMap;
    private final Map<String, PlayerFontFamily> playerFontFamilyMap;
    private final Map<String, PlayerTheme> playerThemeMap;
    private final String prefConfig;
    private final String prefConfigPendingChanges;
    private final SharedPreferences sharedPreferences;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/RestUserConfigService$UserConfigSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class UserConfigSyncException extends Exception {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[PlayerFontFamily.values().length];
            try {
                iArr[PlayerFontFamily.INTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerFontFamily.LIBRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerFontFamily.OPEN_DYSLEXIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlayerTheme.values().length];
            try {
                iArr2[PlayerTheme.SKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlayerTheme.FALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlayerTheme.HIGHLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlayerTheme.CLASSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlayerActionButton.values().length];
            try {
                iArr3[PlayerActionButton.BOOKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PlayerActionButton.SLEEP_TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PlayerActionButton.VOICE_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlayerDisplayMode.values().length];
            try {
                iArr4[PlayerDisplayMode.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[PlayerDisplayMode.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public RestUserConfigService(ConfigAPI configAPI, @UserSharedPreferences SharedPreferences sharedPreferences, vr.c cVar, Logger logger, ConnectivityService connectivityService, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        configAPI.getClass();
        sharedPreferences.getClass();
        cVar.getClass();
        logger.getClass();
        connectivityService.getClass();
        context.getClass();
        this.configAPI = configAPI;
        this.sharedPreferences = sharedPreferences;
        this.json = cVar;
        this.logger = logger;
        this.connectivityService = connectivityService;
        this.appContext = context;
        this.tag = "UserConfigService";
        this.prefConfig = "USER_CONFIG";
        this.prefConfigPendingChanges = "USER_CONFIG_PENDING_CHANGES";
        this.emptyPendingChanges = new ReaderUserConfigResponseModel((String) null, (Long) null, (BigDecimalJson) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (Map) null, (BrowserExtensionConfig) null, (Long) null, 32767, (kotlin.jvm.internal.f) null);
        zn.a entries = PlayerFontFamily.getEntries();
        int H = a0.H(p.a0(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(H < 16 ? 16 : H);
        for (Object obj : entries) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[((PlayerFontFamily) obj).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        str4 = "open_dyslexic";
                    } else {
                        c6.p();
                        throw null;
                    }
                } else {
                    str4 = "libre";
                }
            } else {
                str4 = "inter";
            }
            linkedHashMap.put(str4, obj);
        }
        this.playerFontFamilyMap = linkedHashMap;
        zn.a entries2 = PlayerTheme.getEntries();
        int H2 = a0.H(p.a0(entries2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(H2 < 16 ? 16 : H2);
        for (Object obj2 : entries2) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[((PlayerTheme) obj2).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            str3 = "classic";
                        } else {
                            c6.p();
                            throw null;
                        }
                    } else {
                        str3 = "highlight";
                    }
                } else {
                    str3 = "fall";
                }
            } else {
                str3 = "sky";
            }
            linkedHashMap2.put(str3, obj2);
        }
        this.playerThemeMap = linkedHashMap2;
        zn.a entries3 = PlayerActionButton.getEntries();
        int H3 = a0.H(p.a0(entries3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(H3 < 16 ? 16 : H3);
        for (Object obj3 : entries3) {
            int i12 = WhenMappings.$EnumSwitchMapping$2[((PlayerActionButton) obj3).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        str2 = "voice_picker";
                    } else {
                        c6.p();
                        throw null;
                    }
                } else {
                    str2 = BackgroundPlayerAction.SleepTimer.ACTION_ID;
                }
            } else {
                str2 = BackgroundPlayerAction.Bookmark.ACTION_ID;
            }
            linkedHashMap3.put(str2, obj3);
        }
        this.playerActionButtonMap = linkedHashMap3;
        zn.a entries4 = PlayerDisplayMode.getEntries();
        int H4 = a0.H(p.a0(entries4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(H4 >= 16 ? H4 : 16);
        for (Object obj4 : entries4) {
            int i13 = WhenMappings.$EnumSwitchMapping$3[((PlayerDisplayMode) obj4).ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    str = ParameterNames.TEXT;
                } else {
                    c6.p();
                    throw null;
                }
            } else {
                str = "audio";
            }
            linkedHashMap4.put(str, obj4);
        }
        this.playerDisplayModeMap = linkedHashMap4;
    }

    public static /* synthetic */ z a(ReaderUserConfigResponseModel readerUserConfigResponseModel) {
        return save$lambda$0(readerUserConfigResponseModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r2 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r2 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        if (r2 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
    
        if (r2 == null) goto L229;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ReaderUserConfigResponseModel buildPendingChanges(UserConfigRequest configRequest) {
        Long l4;
        Float playbackSpeedRate;
        BigDecimalJson bigDecimalJson;
        BigDecimalJson playbackSpeedRate2;
        Long playerFontSize;
        Long l7;
        PlayerFontFamily playerFontFamily;
        String str;
        String playerFontFamily2;
        PlayerTheme playerTheme;
        String str2;
        String playerTheme2;
        PlayerDisplayMode playerDisplayMode;
        String str3;
        String playerDisplayMode2;
        PlayerActionButton playerActionButton;
        String str4;
        String playerActionButton2;
        String genfmLanguage;
        String str5;
        String storeCountryCode;
        String str6;
        Boolean matureContentEnabled;
        Boolean bool;
        Long voiceAssistantTermsAgreedAt;
        Long l10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ReaderUserConfigResponseModel lastPendingChanges = getLastPendingChanges();
        Long dailyStreakMinutes = configRequest.getDailyStreakMinutes();
        Long l11 = null;
        if (dailyStreakMinutes == null) {
            if (lastPendingChanges != null) {
                dailyStreakMinutes = lastPendingChanges.getDailyStreakMinutes();
            } else {
                l4 = null;
                playbackSpeedRate = configRequest.getPlaybackSpeedRate();
                if (playbackSpeedRate == null) {
                    playbackSpeedRate2 = new BigDecimalJson(new BigDecimal(String.valueOf(playbackSpeedRate.floatValue())));
                } else if (lastPendingChanges != null) {
                    playbackSpeedRate2 = lastPendingChanges.getPlaybackSpeedRate();
                } else {
                    bigDecimalJson = null;
                    playerFontSize = configRequest.getPlayerFontSize();
                    if (playerFontSize == null) {
                        if (lastPendingChanges != null) {
                            playerFontSize = lastPendingChanges.getPlayerFontSize();
                        } else {
                            l7 = null;
                            playerFontFamily = configRequest.getPlayerFontFamily();
                            if (playerFontFamily != null) {
                                Iterator<T> it = this.playerFontFamilyMap.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (((Map.Entry) obj4).getValue() == playerFontFamily) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                Map.Entry entry = (Map.Entry) obj4;
                                if (entry != null) {
                                    playerFontFamily2 = (String) entry.getKey();
                                } else {
                                    playerFontFamily2 = null;
                                }
                            }
                            if (lastPendingChanges == null) {
                                playerFontFamily2 = lastPendingChanges.getPlayerFontFamily();
                                str = playerFontFamily2;
                                playerTheme = configRequest.getPlayerTheme();
                                if (playerTheme != null) {
                                    Iterator<T> it2 = this.playerThemeMap.entrySet().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = it2.next();
                                            if (((Map.Entry) obj3).getValue() == playerTheme) {
                                                break;
                                            }
                                        } else {
                                            obj3 = null;
                                            break;
                                        }
                                    }
                                    Map.Entry entry2 = (Map.Entry) obj3;
                                    if (entry2 != null) {
                                        playerTheme2 = (String) entry2.getKey();
                                    } else {
                                        playerTheme2 = null;
                                    }
                                }
                                if (lastPendingChanges == null) {
                                    playerTheme2 = lastPendingChanges.getPlayerTheme();
                                    str2 = playerTheme2;
                                    playerDisplayMode = configRequest.getPlayerDisplayMode();
                                    if (playerDisplayMode != null) {
                                        Iterator<T> it3 = this.playerDisplayModeMap.entrySet().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj2 = it3.next();
                                                if (((Map.Entry) obj2).getValue() == playerDisplayMode) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        Map.Entry entry3 = (Map.Entry) obj2;
                                        if (entry3 != null) {
                                            playerDisplayMode2 = (String) entry3.getKey();
                                        } else {
                                            playerDisplayMode2 = null;
                                        }
                                    }
                                    if (lastPendingChanges == null) {
                                        playerDisplayMode2 = lastPendingChanges.getPlayerDisplayMode();
                                        str3 = playerDisplayMode2;
                                        playerActionButton = configRequest.getPlayerActionButton();
                                        if (playerActionButton != null) {
                                            Iterator<T> it4 = this.playerActionButtonMap.entrySet().iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj = it4.next();
                                                    if (((Map.Entry) obj).getValue() == playerActionButton) {
                                                        break;
                                                    }
                                                } else {
                                                    obj = null;
                                                    break;
                                                }
                                            }
                                            Map.Entry entry4 = (Map.Entry) obj;
                                            if (entry4 != null) {
                                                playerActionButton2 = (String) entry4.getKey();
                                            } else {
                                                playerActionButton2 = null;
                                            }
                                        }
                                        if (lastPendingChanges == null) {
                                            playerActionButton2 = lastPendingChanges.getPlayerActionButton();
                                            str4 = playerActionButton2;
                                            genfmLanguage = configRequest.getGenfmLanguage();
                                            if (genfmLanguage == null) {
                                                if (lastPendingChanges != null) {
                                                    genfmLanguage = lastPendingChanges.getGenfmLanguage();
                                                } else {
                                                    str5 = null;
                                                    storeCountryCode = configRequest.getStoreCountryCode();
                                                    if (storeCountryCode == null) {
                                                        if (lastPendingChanges != null) {
                                                            storeCountryCode = lastPendingChanges.getStoreCountryCode();
                                                        } else {
                                                            str6 = null;
                                                            matureContentEnabled = configRequest.getMatureContentEnabled();
                                                            if (matureContentEnabled == null) {
                                                                if (lastPendingChanges != null) {
                                                                    matureContentEnabled = lastPendingChanges.getMatureContentEnabled();
                                                                } else {
                                                                    bool = null;
                                                                    voiceAssistantTermsAgreedAt = configRequest.getVoiceAssistantTermsAgreedAt();
                                                                    if (voiceAssistantTermsAgreedAt == null) {
                                                                        if (lastPendingChanges != null) {
                                                                            l11 = lastPendingChanges.getVoiceAssistantTermsAgreedAtUnix();
                                                                        }
                                                                        l10 = l11;
                                                                    } else {
                                                                        l10 = voiceAssistantTermsAgreedAt;
                                                                    }
                                                                    return new ReaderUserConfigResponseModel((String) null, l4, bigDecimalJson, l7, str, str2, str4, str3, str5, str6, bool, (Map) null, (Map) null, (BrowserExtensionConfig) null, l10, 14337, (kotlin.jvm.internal.f) null);
                                                                }
                                                            }
                                                            bool = matureContentEnabled;
                                                            voiceAssistantTermsAgreedAt = configRequest.getVoiceAssistantTermsAgreedAt();
                                                            if (voiceAssistantTermsAgreedAt == null) {
                                                            }
                                                            return new ReaderUserConfigResponseModel((String) null, l4, bigDecimalJson, l7, str, str2, str4, str3, str5, str6, bool, (Map) null, (Map) null, (BrowserExtensionConfig) null, l10, 14337, (kotlin.jvm.internal.f) null);
                                                        }
                                                    }
                                                    str6 = storeCountryCode;
                                                    matureContentEnabled = configRequest.getMatureContentEnabled();
                                                    if (matureContentEnabled == null) {
                                                    }
                                                    bool = matureContentEnabled;
                                                    voiceAssistantTermsAgreedAt = configRequest.getVoiceAssistantTermsAgreedAt();
                                                    if (voiceAssistantTermsAgreedAt == null) {
                                                    }
                                                    return new ReaderUserConfigResponseModel((String) null, l4, bigDecimalJson, l7, str, str2, str4, str3, str5, str6, bool, (Map) null, (Map) null, (BrowserExtensionConfig) null, l10, 14337, (kotlin.jvm.internal.f) null);
                                                }
                                            }
                                            str5 = genfmLanguage;
                                            storeCountryCode = configRequest.getStoreCountryCode();
                                            if (storeCountryCode == null) {
                                            }
                                            str6 = storeCountryCode;
                                            matureContentEnabled = configRequest.getMatureContentEnabled();
                                            if (matureContentEnabled == null) {
                                            }
                                            bool = matureContentEnabled;
                                            voiceAssistantTermsAgreedAt = configRequest.getVoiceAssistantTermsAgreedAt();
                                            if (voiceAssistantTermsAgreedAt == null) {
                                            }
                                            return new ReaderUserConfigResponseModel((String) null, l4, bigDecimalJson, l7, str, str2, str4, str3, str5, str6, bool, (Map) null, (Map) null, (BrowserExtensionConfig) null, l10, 14337, (kotlin.jvm.internal.f) null);
                                        }
                                        str4 = null;
                                        genfmLanguage = configRequest.getGenfmLanguage();
                                        if (genfmLanguage == null) {
                                        }
                                        str5 = genfmLanguage;
                                        storeCountryCode = configRequest.getStoreCountryCode();
                                        if (storeCountryCode == null) {
                                        }
                                        str6 = storeCountryCode;
                                        matureContentEnabled = configRequest.getMatureContentEnabled();
                                        if (matureContentEnabled == null) {
                                        }
                                        bool = matureContentEnabled;
                                        voiceAssistantTermsAgreedAt = configRequest.getVoiceAssistantTermsAgreedAt();
                                        if (voiceAssistantTermsAgreedAt == null) {
                                        }
                                        return new ReaderUserConfigResponseModel((String) null, l4, bigDecimalJson, l7, str, str2, str4, str3, str5, str6, bool, (Map) null, (Map) null, (BrowserExtensionConfig) null, l10, 14337, (kotlin.jvm.internal.f) null);
                                    }
                                    str3 = null;
                                    playerActionButton = configRequest.getPlayerActionButton();
                                    if (playerActionButton != null) {
                                    }
                                    if (lastPendingChanges == null) {
                                    }
                                } else {
                                    str2 = null;
                                    playerDisplayMode = configRequest.getPlayerDisplayMode();
                                    if (playerDisplayMode != null) {
                                    }
                                    if (lastPendingChanges == null) {
                                    }
                                }
                            } else {
                                str = null;
                                playerTheme = configRequest.getPlayerTheme();
                                if (playerTheme != null) {
                                }
                                if (lastPendingChanges == null) {
                                }
                            }
                        }
                    }
                    l7 = playerFontSize;
                    playerFontFamily = configRequest.getPlayerFontFamily();
                    if (playerFontFamily != null) {
                    }
                    if (lastPendingChanges == null) {
                    }
                }
                bigDecimalJson = playbackSpeedRate2;
                playerFontSize = configRequest.getPlayerFontSize();
                if (playerFontSize == null) {
                }
                l7 = playerFontSize;
                playerFontFamily = configRequest.getPlayerFontFamily();
                if (playerFontFamily != null) {
                }
                if (lastPendingChanges == null) {
                }
            }
        }
        l4 = dailyStreakMinutes;
        playbackSpeedRate = configRequest.getPlaybackSpeedRate();
        if (playbackSpeedRate == null) {
        }
        bigDecimalJson = playbackSpeedRate2;
        playerFontSize = configRequest.getPlayerFontSize();
        if (playerFontSize == null) {
        }
        l7 = playerFontSize;
        playerFontFamily = configRequest.getPlayerFontFamily();
        if (playerFontFamily != null) {
        }
        if (lastPendingChanges == null) {
        }
    }

    public final ReaderUserConfigResponseModel getLastPendingChanges() {
        Object lVar;
        Object obj = null;
        String string = this.sharedPreferences.getString(this.prefConfigPendingChanges, null);
        if (string == null) {
            return null;
        }
        try {
            vr.c cVar = this.json;
            cVar.getClass();
            lVar = (ReaderUserConfigResponseModel) cVar.b(string, ReaderUserConfigResponseModel.INSTANCE.serializer());
        } catch (Throwable th) {
            lVar = new sn.l(th);
        }
        if (!(lVar instanceof sn.l)) {
            obj = lVar;
        }
        return (ReaderUserConfigResponseModel) obj;
    }

    public final ir.i getPendingChanges() {
        return SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefConfigPendingChanges, new RestUserConfigService$getPendingChanges$1(this, null));
    }

    private final ir.i getSavedConfig() {
        return new a1(SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefConfig, new RestUserConfigService$getSavedConfig$1(this, null)), 0);
    }

    public static final z save$lambda$0(ReaderUserConfigResponseModel readerUserConfigResponseModel) {
        readerUserConfigResponseModel.getClass();
        return z.f31622a;
    }

    public final void saveConfig(ReaderUserConfigResponseModel result) {
        Logger logger = this.logger;
        Map<String, String> featureFlagVariants = result.getFeatureFlagVariants();
        if (featureFlagVariants == null) {
            featureFlagVariants = u.f33548a;
        }
        Map<String, ? extends Object> singletonMap = Collections.singletonMap("feature_flags", featureFlagVariants);
        singletonMap.getClass();
        logger.setExtras(singletonMap);
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        String str = this.prefConfig;
        vr.c cVar = this.json;
        cVar.getClass();
        edit.putString(str, cVar.d(ReaderUserConfigResponseModel.INSTANCE.serializer(), result)).apply();
    }

    public final void savePendingChanges(ReaderUserConfigResponseModel pendingChanges) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        String str = this.prefConfigPendingChanges;
        vr.c cVar = this.json;
        cVar.getClass();
        edit.putString(str, cVar.d(ReaderUserConfigResponseModel.INSTANCE.serializer(), pendingChanges));
        edit.apply();
    }

    public final UserConfig toDomain(ReaderUserConfigResponseModel readerUserConfigResponseModel) {
        long j4;
        float f10;
        long j10;
        PlayerFontFamily playerFontFamily;
        PlayerTheme playerTheme;
        PlayerActionButton playerActionButton;
        PlayerDisplayMode playerDisplayMode;
        BigDecimal value;
        Long dailyStreakMinutes = readerUserConfigResponseModel.getDailyStreakMinutes();
        if (dailyStreakMinutes != null) {
            j4 = dailyStreakMinutes.longValue();
        } else {
            j4 = 5;
        }
        long j11 = j4;
        BigDecimalJson playbackSpeedRate = readerUserConfigResponseModel.getPlaybackSpeedRate();
        if (playbackSpeedRate != null && (value = playbackSpeedRate.getValue()) != null) {
            f10 = value.floatValue();
        } else {
            f10 = 1.0f;
        }
        String genfmLanguage = readerUserConfigResponseModel.getGenfmLanguage();
        Boolean matureContentEnabled = readerUserConfigResponseModel.getMatureContentEnabled();
        Long playerFontSize = readerUserConfigResponseModel.getPlayerFontSize();
        if (playerFontSize != null) {
            j10 = playerFontSize.longValue();
        } else {
            j10 = 16;
        }
        long j12 = j10;
        String playerFontFamily2 = readerUserConfigResponseModel.getPlayerFontFamily();
        if (playerFontFamily2 == null || (playerFontFamily = this.playerFontFamilyMap.get(playerFontFamily2)) == null) {
            playerFontFamily = PlayerFontFamily.INTER;
        }
        PlayerFontFamily playerFontFamily3 = playerFontFamily;
        String playerTheme2 = readerUserConfigResponseModel.getPlayerTheme();
        if (playerTheme2 == null || (playerTheme = this.playerThemeMap.get(playerTheme2)) == null) {
            playerTheme = PlayerTheme.SKY;
        }
        PlayerTheme playerTheme3 = playerTheme;
        String playerActionButton2 = readerUserConfigResponseModel.getPlayerActionButton();
        if (playerActionButton2 == null || (playerActionButton = this.playerActionButtonMap.get(playerActionButton2)) == null) {
            playerActionButton = PlayerActionButton.BOOKMARK;
        }
        PlayerActionButton playerActionButton3 = playerActionButton;
        if (m.c(readerUserConfigResponseModel.getPlayerDisplayMode(), "audio")) {
            playerDisplayMode = PlayerDisplayMode.Audio;
        } else {
            playerDisplayMode = PlayerDisplayMode.Text;
        }
        UserConfig.PlayerConfig playerConfig = new UserConfig.PlayerConfig(j12, playerFontFamily3, playerTheme3, playerActionButton3, playerDisplayMode);
        String storeCountryCode = readerUserConfigResponseModel.getStoreCountryCode();
        Map<String, String> featureFlagVariants = readerUserConfigResponseModel.getFeatureFlagVariants();
        if (featureFlagVariants == null) {
            featureFlagVariants = u.f33548a;
        }
        return new UserConfig(j11, Float.valueOf(f10), playerConfig, genfmLanguage, storeCountryCode, matureContentEnabled, featureFlagVariants, readerUserConfigResponseModel.getVoiceAssistantTermsAgreedAtUnix());
    }

    @Override // io.elevenlabs.domain.services.UserConfigService
    public ir.i getConfig() {
        return r.G(getSavedConfig(), new RestUserConfigService$getConfig$$inlined$flatMapLatest$1(null, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.UserConfigService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object save(UserConfigRequest userConfigRequest, wn.c<? super AsyncCallResult<z>> cVar) {
        RestUserConfigService$save$1 restUserConfigService$save$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof RestUserConfigService$save$1) {
            restUserConfigService$save$1 = (RestUserConfigService$save$1) cVar;
            int i11 = restUserConfigService$save$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restUserConfigService$save$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restUserConfigService$save$1.result;
                i10 = restUserConfigService$save$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ConfigAPI configAPI = this.configAPI;
                    ReaderUserConfigResponseModel buildPendingChanges = buildPendingChanges(userConfigRequest);
                    restUserConfigService$save$1.L$0 = null;
                    restUserConfigService$save$1.label = 1;
                    obj = configAPI.saveUserConfig(buildPendingChanges, restUserConfigService$save$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        saveConfig((ReaderUserConfigResponseModel) ((AsyncCallResult.Success) domain).getData());
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new h(4));
            }
        }
        restUserConfigService$save$1 = new RestUserConfigService$save$1(this, cVar);
        Object obj2 = restUserConfigService$save$1.result;
        i10 = restUserConfigService$save$1.label;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new h(4));
    }

    @Override // io.elevenlabs.domain.services.UserConfigService
    public Object saveAsync(UserConfigRequest userConfigRequest, wn.c<? super z> cVar) {
        savePendingChanges(buildPendingChanges(userConfigRequest));
        SaveUserConfigWorker.INSTANCE.enqueue(this.appContext);
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.UserConfigService
    public Object sync(wn.c<? super ir.i> cVar) {
        return r.j(new RestUserConfigService$sync$2(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.UserConfigService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncPendingChanges(wn.c<? super z> cVar) {
        RestUserConfigService$syncPendingChanges$1 restUserConfigService$syncPendingChanges$1;
        int i10;
        ApiResult apiResult;
        String c5;
        if (cVar instanceof RestUserConfigService$syncPendingChanges$1) {
            restUserConfigService$syncPendingChanges$1 = (RestUserConfigService$syncPendingChanges$1) cVar;
            int i11 = restUserConfigService$syncPendingChanges$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restUserConfigService$syncPendingChanges$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restUserConfigService$syncPendingChanges$1.result;
                i10 = restUserConfigService$syncPendingChanges$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReaderUserConfigResponseModel lastPendingChanges = getLastPendingChanges();
                    if (lastPendingChanges != null && !lastPendingChanges.equals(this.emptyPendingChanges)) {
                        ConfigAPI configAPI = this.configAPI;
                        restUserConfigService$syncPendingChanges$1.L$0 = null;
                        restUserConfigService$syncPendingChanges$1.label = 1;
                        obj = configAPI.saveUserConfig(lastPendingChanges, restUserConfigService$syncPendingChanges$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        this.logger.log(this.tag, "No pending config changes to flush");
                        return z.f31622a;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    this.logger.log(this.tag, "Pending config changes flushed successfully");
                    saveConfig((ReaderUserConfigResponseModel) ((ApiResult.Success) apiResult).getData());
                    savePendingChanges(this.emptyPendingChanges);
                    return z.f31622a;
                }
                if (apiResult instanceof ApiResult.Error) {
                    ApiResult.Error error = (ApiResult.Error) apiResult;
                    if (!(error instanceof ApiResult.Error.ApiError)) {
                        if (!(error instanceof ApiResult.Error.NetworkError)) {
                            if (!(error instanceof ApiResult.Error.UnknownError)) {
                                c6.p();
                                return null;
                            }
                            c5 = defpackage.f.i("Unknown Error: ", ((ApiResult.Error.UnknownError) apiResult).getMessage());
                        } else {
                            c5 = "Network Error: Unable to connect to server";
                        }
                    } else {
                        ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
                        c5 = z.h.c("API Error: ", apiError.getMessage(), " (", apiError.getCode(), Separators.RPAREN);
                    }
                    this.logger.log(this.tag, "Error flushing pending config changes: ".concat(c5));
                    throw new UserConfigSyncException();
                }
                c6.p();
                return null;
            }
        }
        restUserConfigService$syncPendingChanges$1 = new RestUserConfigService$syncPendingChanges$1(this, cVar);
        Object obj2 = restUserConfigService$syncPendingChanges$1.result;
        i10 = restUserConfigService$syncPendingChanges$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}

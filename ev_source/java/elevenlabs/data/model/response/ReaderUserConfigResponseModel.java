package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.BrowserExtensionConfig;
import io.elevenlabs.data.model.BrowserExtensionConfig$$serializer;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import rd.c1;
import sn.h;
import sn.i;
import ur.g1;
import ur.h0;
import ur.l0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 i2\u00020\u0001:\u0002jiBÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018BÉ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010!JÜ\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001fJ\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010D\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010H\u0012\u0004\bJ\u0010G\u001a\u0004\bI\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bM\u0010G\u001a\u0004\bL\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010H\u0012\u0004\bO\u0010G\u001a\u0004\bN\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bQ\u0010G\u001a\u0004\bP\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bS\u0010G\u001a\u0004\bR\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bU\u0010G\u001a\u0004\bT\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bW\u0010G\u001a\u0004\bV\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bY\u0010G\u001a\u0004\bX\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\b[\u0010G\u001a\u0004\bZ\u0010\u001fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\\\u0012\u0004\b^\u0010G\u001a\u0004\b]\u0010,R.\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\ba\u0010G\u001a\u0004\b`\u0010.R.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010_\u0012\u0004\bc\u0010G\u001a\u0004\bb\u0010.R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010d\u0012\u0004\bf\u0010G\u001a\u0004\be\u00101R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010H\u0012\u0004\bh\u0010G\u001a\u0004\bg\u0010!¨\u0006k"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "", "", "defaultVoiceId", "", "dailyStreakMinutes", "Lio/elevenlabs/data/model/BigDecimalJson;", "playbackSpeedRate", "playerFontSize", "playerFontFamily", "playerTheme", "playerActionButton", "playerDisplayMode", "genfmLanguage", "storeCountryCode", "", "matureContentEnabled", "", "featureFlags", "featureFlagVariants", "Lio/elevenlabs/data/model/BrowserExtensionConfig;", "browserExtension", "voiceAssistantTermsAgreedAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lio/elevenlabs/data/model/BrowserExtensionConfig;Ljava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lio/elevenlabs/data/model/BrowserExtensionConfig;Ljava/lang/Long;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Lio/elevenlabs/data/model/BigDecimalJson;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "()Ljava/util/Map;", "component13", "component14", "()Lio/elevenlabs/data/model/BrowserExtensionConfig;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lio/elevenlabs/data/model/BrowserExtensionConfig;Ljava/lang/Long;)Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDefaultVoiceId", "getDefaultVoiceId$annotations", "()V", "Ljava/lang/Long;", "getDailyStreakMinutes", "getDailyStreakMinutes$annotations", "Lio/elevenlabs/data/model/BigDecimalJson;", "getPlaybackSpeedRate", "getPlaybackSpeedRate$annotations", "getPlayerFontSize", "getPlayerFontSize$annotations", "getPlayerFontFamily", "getPlayerFontFamily$annotations", "getPlayerTheme", "getPlayerTheme$annotations", "getPlayerActionButton", "getPlayerActionButton$annotations", "getPlayerDisplayMode", "getPlayerDisplayMode$annotations", "getGenfmLanguage", "getGenfmLanguage$annotations", "getStoreCountryCode", "getStoreCountryCode$annotations", "Ljava/lang/Boolean;", "getMatureContentEnabled", "getMatureContentEnabled$annotations", "Ljava/util/Map;", "getFeatureFlags", "getFeatureFlags$annotations", "getFeatureFlagVariants", "getFeatureFlagVariants$annotations", "Lio/elevenlabs/data/model/BrowserExtensionConfig;", "getBrowserExtension", "getBrowserExtension$annotations", "getVoiceAssistantTermsAgreedAtUnix", "getVoiceAssistantTermsAgreedAtUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderUserConfigResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BrowserExtensionConfig browserExtension;
    private final Long dailyStreakMinutes;
    private final String defaultVoiceId;
    private final Map<String, String> featureFlagVariants;
    private final Map<String, Boolean> featureFlags;
    private final String genfmLanguage;
    private final Boolean matureContentEnabled;
    private final BigDecimalJson playbackSpeedRate;
    private final String playerActionButton;
    private final String playerDisplayMode;
    private final String playerFontFamily;
    private final Long playerFontSize;
    private final String playerTheme;
    private final String storeCountryCode;
    private final Long voiceAssistantTermsAgreedAtUnix;

    static {
        d dVar = new d(6);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, sn.a.d(iVar, dVar), null, null, null, null, null, null, null, null, sn.a.d(iVar, new d(7)), sn.a.d(iVar, new d(8)), null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReaderUserConfigResponseModel(String str, Long l4, BigDecimalJson bigDecimalJson, Long l7, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Map map, Map map2, BrowserExtensionConfig browserExtensionConfig, Long l10, int i10, f fVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r32);
        String str8;
        Long l11;
        BigDecimalJson bigDecimalJson2;
        Long l12;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool2;
        Map map3;
        Map map4;
        BrowserExtensionConfig browserExtensionConfig2;
        Long l13;
        if ((i10 & 1) != 0) {
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i10 & 2) != 0) {
            l11 = null;
        } else {
            l11 = l4;
        }
        if ((i10 & 4) != 0) {
            bigDecimalJson2 = null;
        } else {
            bigDecimalJson2 = bigDecimalJson;
        }
        if ((i10 & 8) != 0) {
            l12 = null;
        } else {
            l12 = l7;
        }
        if ((i10 & 16) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i10 & 32) != 0) {
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i10 & 64) != 0) {
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i10 & 128) != 0) {
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i10 & 512) != 0) {
            str14 = null;
        } else {
            str14 = str7;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i10 & 2048) != 0) {
            map3 = null;
        } else {
            map3 = map;
        }
        if ((i10 & 4096) != 0) {
            map4 = null;
        } else {
            map4 = map2;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            browserExtensionConfig2 = null;
        } else {
            browserExtensionConfig2 = browserExtensionConfig;
        }
        if ((i10 & 16384) != 0) {
            l13 = null;
        } else {
            l13 = l10;
        }
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), c1.w(BigDecimalJson.INSTANCE.serializer()), new KSerializer[0]);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new h0(g1.f34588a, ur.g.f34583a);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static /* synthetic */ ReaderUserConfigResponseModel copy$default(ReaderUserConfigResponseModel readerUserConfigResponseModel, String str, Long l4, BigDecimalJson bigDecimalJson, Long l7, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Map map, Map map2, BrowserExtensionConfig browserExtensionConfig, Long l10, int i10, Object obj) {
        String str8;
        Long l11;
        BigDecimalJson bigDecimalJson2;
        Long l12;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool2;
        Map map3;
        Map map4;
        BrowserExtensionConfig browserExtensionConfig2;
        Long l13;
        if ((i10 & 1) != 0) {
            str8 = readerUserConfigResponseModel.defaultVoiceId;
        } else {
            str8 = str;
        }
        if ((i10 & 2) != 0) {
            l11 = readerUserConfigResponseModel.dailyStreakMinutes;
        } else {
            l11 = l4;
        }
        if ((i10 & 4) != 0) {
            bigDecimalJson2 = readerUserConfigResponseModel.playbackSpeedRate;
        } else {
            bigDecimalJson2 = bigDecimalJson;
        }
        if ((i10 & 8) != 0) {
            l12 = readerUserConfigResponseModel.playerFontSize;
        } else {
            l12 = l7;
        }
        if ((i10 & 16) != 0) {
            str9 = readerUserConfigResponseModel.playerFontFamily;
        } else {
            str9 = str2;
        }
        if ((i10 & 32) != 0) {
            str10 = readerUserConfigResponseModel.playerTheme;
        } else {
            str10 = str3;
        }
        if ((i10 & 64) != 0) {
            str11 = readerUserConfigResponseModel.playerActionButton;
        } else {
            str11 = str4;
        }
        if ((i10 & 128) != 0) {
            str12 = readerUserConfigResponseModel.playerDisplayMode;
        } else {
            str12 = str5;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str13 = readerUserConfigResponseModel.genfmLanguage;
        } else {
            str13 = str6;
        }
        if ((i10 & 512) != 0) {
            str14 = readerUserConfigResponseModel.storeCountryCode;
        } else {
            str14 = str7;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            bool2 = readerUserConfigResponseModel.matureContentEnabled;
        } else {
            bool2 = bool;
        }
        if ((i10 & 2048) != 0) {
            map3 = readerUserConfigResponseModel.featureFlags;
        } else {
            map3 = map;
        }
        if ((i10 & 4096) != 0) {
            map4 = readerUserConfigResponseModel.featureFlagVariants;
        } else {
            map4 = map2;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            browserExtensionConfig2 = readerUserConfigResponseModel.browserExtension;
        } else {
            browserExtensionConfig2 = browserExtensionConfig;
        }
        if ((i10 & 16384) != 0) {
            l13 = readerUserConfigResponseModel.voiceAssistantTermsAgreedAtUnix;
        } else {
            l13 = l10;
        }
        return readerUserConfigResponseModel.copy(str8, l11, bigDecimalJson2, l12, str9, str10, str11, str12, str13, str14, bool2, map3, map4, browserExtensionConfig2, l13);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderUserConfigResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || self.defaultVoiceId != null) {
            output.o(serialDesc, 0, g1.f34588a, self.defaultVoiceId);
        }
        if (output.C(serialDesc) || self.dailyStreakMinutes != null) {
            output.o(serialDesc, 1, l0.f34611a, self.dailyStreakMinutes);
        }
        if (output.C(serialDesc) || self.playbackSpeedRate != null) {
            output.o(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.playbackSpeedRate);
        }
        if (output.C(serialDesc) || self.playerFontSize != null) {
            output.o(serialDesc, 3, l0.f34611a, self.playerFontSize);
        }
        if (output.C(serialDesc) || self.playerFontFamily != null) {
            output.o(serialDesc, 4, g1.f34588a, self.playerFontFamily);
        }
        if (output.C(serialDesc) || self.playerTheme != null) {
            output.o(serialDesc, 5, g1.f34588a, self.playerTheme);
        }
        if (output.C(serialDesc) || self.playerActionButton != null) {
            output.o(serialDesc, 6, g1.f34588a, self.playerActionButton);
        }
        if (output.C(serialDesc) || self.playerDisplayMode != null) {
            output.o(serialDesc, 7, g1.f34588a, self.playerDisplayMode);
        }
        if (output.C(serialDesc) || self.genfmLanguage != null) {
            output.o(serialDesc, 8, g1.f34588a, self.genfmLanguage);
        }
        if (output.C(serialDesc) || self.storeCountryCode != null) {
            output.o(serialDesc, 9, g1.f34588a, self.storeCountryCode);
        }
        if (output.C(serialDesc) || self.matureContentEnabled != null) {
            output.o(serialDesc, 10, ur.g.f34583a, self.matureContentEnabled);
        }
        if (output.C(serialDesc) || self.featureFlags != null) {
            output.o(serialDesc, 11, (KSerializer) hVarArr[11].getValue(), self.featureFlags);
        }
        if (output.C(serialDesc) || self.featureFlagVariants != null) {
            output.o(serialDesc, 12, (KSerializer) hVarArr[12].getValue(), self.featureFlagVariants);
        }
        if (output.C(serialDesc) || self.browserExtension != null) {
            output.o(serialDesc, 13, BrowserExtensionConfig$$serializer.INSTANCE, self.browserExtension);
        }
        if (output.C(serialDesc) || self.voiceAssistantTermsAgreedAtUnix != null) {
            output.o(serialDesc, 14, l0.f34611a, self.voiceAssistantTermsAgreedAtUnix);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultVoiceId() {
        return this.defaultVoiceId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStoreCountryCode() {
        return this.storeCountryCode;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getMatureContentEnabled() {
        return this.matureContentEnabled;
    }

    public final Map<String, Boolean> component12() {
        return this.featureFlags;
    }

    public final Map<String, String> component13() {
        return this.featureFlagVariants;
    }

    /* renamed from: component14, reason: from getter */
    public final BrowserExtensionConfig getBrowserExtension() {
        return this.browserExtension;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getVoiceAssistantTermsAgreedAtUnix() {
        return this.voiceAssistantTermsAgreedAtUnix;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimalJson getPlaybackSpeedRate() {
        return this.playbackSpeedRate;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getPlayerFontSize() {
        return this.playerFontSize;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlayerFontFamily() {
        return this.playerFontFamily;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlayerTheme() {
        return this.playerTheme;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlayerActionButton() {
        return this.playerActionButton;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGenfmLanguage() {
        return this.genfmLanguage;
    }

    public final ReaderUserConfigResponseModel copy(String defaultVoiceId, Long dailyStreakMinutes, BigDecimalJson playbackSpeedRate, Long playerFontSize, String playerFontFamily, String playerTheme, String playerActionButton, String playerDisplayMode, String genfmLanguage, String storeCountryCode, Boolean matureContentEnabled, Map<String, Boolean> featureFlags, Map<String, String> featureFlagVariants, BrowserExtensionConfig browserExtension, Long voiceAssistantTermsAgreedAtUnix) {
        return new ReaderUserConfigResponseModel(defaultVoiceId, dailyStreakMinutes, playbackSpeedRate, playerFontSize, playerFontFamily, playerTheme, playerActionButton, playerDisplayMode, genfmLanguage, storeCountryCode, matureContentEnabled, featureFlags, featureFlagVariants, browserExtension, voiceAssistantTermsAgreedAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderUserConfigResponseModel)) {
            return false;
        }
        ReaderUserConfigResponseModel readerUserConfigResponseModel = (ReaderUserConfigResponseModel) other;
        if (m.c(this.defaultVoiceId, readerUserConfigResponseModel.defaultVoiceId) && m.c(this.dailyStreakMinutes, readerUserConfigResponseModel.dailyStreakMinutes) && m.c(this.playbackSpeedRate, readerUserConfigResponseModel.playbackSpeedRate) && m.c(this.playerFontSize, readerUserConfigResponseModel.playerFontSize) && m.c(this.playerFontFamily, readerUserConfigResponseModel.playerFontFamily) && m.c(this.playerTheme, readerUserConfigResponseModel.playerTheme) && m.c(this.playerActionButton, readerUserConfigResponseModel.playerActionButton) && m.c(this.playerDisplayMode, readerUserConfigResponseModel.playerDisplayMode) && m.c(this.genfmLanguage, readerUserConfigResponseModel.genfmLanguage) && m.c(this.storeCountryCode, readerUserConfigResponseModel.storeCountryCode) && m.c(this.matureContentEnabled, readerUserConfigResponseModel.matureContentEnabled) && m.c(this.featureFlags, readerUserConfigResponseModel.featureFlags) && m.c(this.featureFlagVariants, readerUserConfigResponseModel.featureFlagVariants) && m.c(this.browserExtension, readerUserConfigResponseModel.browserExtension) && m.c(this.voiceAssistantTermsAgreedAtUnix, readerUserConfigResponseModel.voiceAssistantTermsAgreedAtUnix)) {
            return true;
        }
        return false;
    }

    public final BrowserExtensionConfig getBrowserExtension() {
        return this.browserExtension;
    }

    public final Long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    public final String getDefaultVoiceId() {
        return this.defaultVoiceId;
    }

    public final Map<String, String> getFeatureFlagVariants() {
        return this.featureFlagVariants;
    }

    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getGenfmLanguage() {
        return this.genfmLanguage;
    }

    public final Boolean getMatureContentEnabled() {
        return this.matureContentEnabled;
    }

    public final BigDecimalJson getPlaybackSpeedRate() {
        return this.playbackSpeedRate;
    }

    public final String getPlayerActionButton() {
        return this.playerActionButton;
    }

    public final String getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    public final String getPlayerFontFamily() {
        return this.playerFontFamily;
    }

    public final Long getPlayerFontSize() {
        return this.playerFontSize;
    }

    public final String getPlayerTheme() {
        return this.playerTheme;
    }

    public final String getStoreCountryCode() {
        return this.storeCountryCode;
    }

    public final Long getVoiceAssistantTermsAgreedAtUnix() {
        return this.voiceAssistantTermsAgreedAtUnix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        String str = this.defaultVoiceId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        Long l4 = this.dailyStreakMinutes;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        BigDecimalJson bigDecimalJson = this.playbackSpeedRate;
        if (bigDecimalJson == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bigDecimalJson.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Long l7 = this.playerFontSize;
        if (l7 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l7.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str2 = this.playerFontFamily;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str3 = this.playerTheme;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str4 = this.playerActionButton;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str5 = this.playerDisplayMode;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str6 = this.genfmLanguage;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        String str7 = this.storeCountryCode;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Boolean bool = this.matureContentEnabled;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        Map<String, Boolean> map = this.featureFlags;
        if (map == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = map.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        Map<String, String> map2 = this.featureFlagVariants;
        if (map2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = map2.hashCode();
        }
        int i23 = (i22 + hashCode13) * 31;
        BrowserExtensionConfig browserExtensionConfig = this.browserExtension;
        if (browserExtensionConfig == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = browserExtensionConfig.hashCode();
        }
        int i24 = (i23 + hashCode14) * 31;
        Long l10 = this.voiceAssistantTermsAgreedAtUnix;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return i24 + i10;
    }

    public String toString() {
        String str = this.defaultVoiceId;
        Long l4 = this.dailyStreakMinutes;
        BigDecimalJson bigDecimalJson = this.playbackSpeedRate;
        Long l7 = this.playerFontSize;
        String str2 = this.playerFontFamily;
        String str3 = this.playerTheme;
        String str4 = this.playerActionButton;
        String str5 = this.playerDisplayMode;
        String str6 = this.genfmLanguage;
        String str7 = this.storeCountryCode;
        Boolean bool = this.matureContentEnabled;
        Map<String, Boolean> map = this.featureFlags;
        Map<String, String> map2 = this.featureFlagVariants;
        BrowserExtensionConfig browserExtensionConfig = this.browserExtension;
        Long l10 = this.voiceAssistantTermsAgreedAtUnix;
        StringBuilder sb = new StringBuilder("ReaderUserConfigResponseModel(defaultVoiceId=");
        sb.append(str);
        sb.append(", dailyStreakMinutes=");
        sb.append(l4);
        sb.append(", playbackSpeedRate=");
        sb.append(bigDecimalJson);
        sb.append(", playerFontSize=");
        sb.append(l7);
        sb.append(", playerFontFamily=");
        defpackage.f.x(sb, str2, ", playerTheme=", str3, ", playerActionButton=");
        defpackage.f.x(sb, str4, ", playerDisplayMode=", str5, ", genfmLanguage=");
        defpackage.f.x(sb, str6, ", storeCountryCode=", str7, ", matureContentEnabled=");
        sb.append(bool);
        sb.append(", featureFlags=");
        sb.append(map);
        sb.append(", featureFlagVariants=");
        sb.append(map2);
        sb.append(", browserExtension=");
        sb.append(browserExtensionConfig);
        sb.append(", voiceAssistantTermsAgreedAtUnix=");
        sb.append(l10);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderUserConfigResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBrowserExtension$annotations() {
    }

    public static /* synthetic */ void getDailyStreakMinutes$annotations() {
    }

    public static /* synthetic */ void getDefaultVoiceId$annotations() {
    }

    public static /* synthetic */ void getFeatureFlagVariants$annotations() {
    }

    public static /* synthetic */ void getFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getGenfmLanguage$annotations() {
    }

    public static /* synthetic */ void getMatureContentEnabled$annotations() {
    }

    public static /* synthetic */ void getPlaybackSpeedRate$annotations() {
    }

    public static /* synthetic */ void getPlayerActionButton$annotations() {
    }

    public static /* synthetic */ void getPlayerDisplayMode$annotations() {
    }

    public static /* synthetic */ void getPlayerFontFamily$annotations() {
    }

    public static /* synthetic */ void getPlayerFontSize$annotations() {
    }

    public static /* synthetic */ void getPlayerTheme$annotations() {
    }

    public static /* synthetic */ void getStoreCountryCode$annotations() {
    }

    public static /* synthetic */ void getVoiceAssistantTermsAgreedAtUnix$annotations() {
    }

    public /* synthetic */ ReaderUserConfigResponseModel(int i10, String str, Long l4, BigDecimalJson bigDecimalJson, Long l7, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Map map, Map map2, BrowserExtensionConfig browserExtensionConfig, Long l10, ur.c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.defaultVoiceId = null;
        } else {
            this.defaultVoiceId = str;
        }
        if ((i10 & 2) == 0) {
            this.dailyStreakMinutes = null;
        } else {
            this.dailyStreakMinutes = l4;
        }
        if ((i10 & 4) == 0) {
            this.playbackSpeedRate = null;
        } else {
            this.playbackSpeedRate = bigDecimalJson;
        }
        if ((i10 & 8) == 0) {
            this.playerFontSize = null;
        } else {
            this.playerFontSize = l7;
        }
        if ((i10 & 16) == 0) {
            this.playerFontFamily = null;
        } else {
            this.playerFontFamily = str2;
        }
        if ((i10 & 32) == 0) {
            this.playerTheme = null;
        } else {
            this.playerTheme = str3;
        }
        if ((i10 & 64) == 0) {
            this.playerActionButton = null;
        } else {
            this.playerActionButton = str4;
        }
        if ((i10 & 128) == 0) {
            this.playerDisplayMode = null;
        } else {
            this.playerDisplayMode = str5;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
            this.genfmLanguage = null;
        } else {
            this.genfmLanguage = str6;
        }
        if ((i10 & 512) == 0) {
            this.storeCountryCode = null;
        } else {
            this.storeCountryCode = str7;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.matureContentEnabled = null;
        } else {
            this.matureContentEnabled = bool;
        }
        if ((i10 & 2048) == 0) {
            this.featureFlags = null;
        } else {
            this.featureFlags = map;
        }
        if ((i10 & 4096) == 0) {
            this.featureFlagVariants = null;
        } else {
            this.featureFlagVariants = map2;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.browserExtension = null;
        } else {
            this.browserExtension = browserExtensionConfig;
        }
        if ((i10 & 16384) == 0) {
            this.voiceAssistantTermsAgreedAtUnix = null;
        } else {
            this.voiceAssistantTermsAgreedAtUnix = l10;
        }
    }

    public ReaderUserConfigResponseModel(String str, Long l4, BigDecimalJson bigDecimalJson, Long l7, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Map<String, Boolean> map, Map<String, String> map2, BrowserExtensionConfig browserExtensionConfig, Long l10) {
        this.defaultVoiceId = str;
        this.dailyStreakMinutes = l4;
        this.playbackSpeedRate = bigDecimalJson;
        this.playerFontSize = l7;
        this.playerFontFamily = str2;
        this.playerTheme = str3;
        this.playerActionButton = str4;
        this.playerDisplayMode = str5;
        this.genfmLanguage = str6;
        this.storeCountryCode = str7;
        this.matureContentEnabled = bool;
        this.featureFlags = map;
        this.featureFlagVariants = map2;
        this.browserExtension = browserExtensionConfig;
        this.voiceAssistantTermsAgreedAtUnix = l10;
    }

    public ReaderUserConfigResponseModel() {
        this((String) null, (Long) null, (BigDecimalJson) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (Map) null, (BrowserExtensionConfig) null, (Long) null, 32767, (f) null);
    }
}

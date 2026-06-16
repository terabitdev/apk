package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015BÉ\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,JÖ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001cR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010B\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010\u001eR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010B\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010\u001eR.\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010B\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bL\u0010A\u001a\u0004\bK\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bN\u0010A\u001a\u0004\bM\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010O\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010O\u0012\u0004\bS\u0010A\u001a\u0004\bR\u0010%R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\bU\u0010A\u001a\u0004\bT\u0010\u001cR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bW\u0010A\u001a\u0004\bV\u0010\u001cR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bY\u0010A\u001a\u0004\bX\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010>\u0012\u0004\b[\u0010A\u001a\u0004\bZ\u0010\u001cR \u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\\\u0012\u0004\b^\u0010A\u001a\u0004\b]\u0010,¨\u0006a"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "", "", "defaultVoice", "", "androidNotificationChannels", "", "featureFlags", "deviceFeatureFlags", "rnMinAppVersion", "androidMinAppVersion", "iosMinAppVersion", "", "playerBufferMaxLengthSeconds", "playerBufferMinLengthSeconds", "importTutorialIosUrl", "reportProblemUrl", "copyrightTakedownUrl", "contentProviderWaitlistUrl", "androidRtlCanvasValidation", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Long;", "component9", "component10", "component11", "component12", "component13", "component14", "()Z", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDefaultVoice", "getDefaultVoice$annotations", "()V", "Ljava/util/Map;", "getAndroidNotificationChannels", "getAndroidNotificationChannels$annotations", "getFeatureFlags", "getFeatureFlags$annotations", "getDeviceFeatureFlags", "getDeviceFeatureFlags$annotations", "getRnMinAppVersion", "getRnMinAppVersion$annotations", "getAndroidMinAppVersion", "getAndroidMinAppVersion$annotations", "getIosMinAppVersion", "getIosMinAppVersion$annotations", "Ljava/lang/Long;", "getPlayerBufferMaxLengthSeconds", "getPlayerBufferMaxLengthSeconds$annotations", "getPlayerBufferMinLengthSeconds", "getPlayerBufferMinLengthSeconds$annotations", "getImportTutorialIosUrl", "getImportTutorialIosUrl$annotations", "getReportProblemUrl", "getReportProblemUrl$annotations", "getCopyrightTakedownUrl", "getCopyrightTakedownUrl$annotations", "getContentProviderWaitlistUrl", "getContentProviderWaitlistUrl$annotations", "Z", "getAndroidRtlCanvasValidation", "getAndroidRtlCanvasValidation$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderAppConfigResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String androidMinAppVersion;
    private final Map<String, String> androidNotificationChannels;
    private final boolean androidRtlCanvasValidation;
    private final String contentProviderWaitlistUrl;
    private final String copyrightTakedownUrl;
    private final String defaultVoice;
    private final Map<String, String> deviceFeatureFlags;
    private final Map<String, Boolean> featureFlags;
    private final String importTutorialIosUrl;
    private final String iosMinAppVersion;
    private final Long playerBufferMaxLengthSeconds;
    private final Long playerBufferMinLengthSeconds;
    private final String reportProblemUrl;
    private final String rnMinAppVersion;

    static {
        c cVar = new c(20);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, sn.a.d(iVar, cVar), sn.a.d(iVar, new c(21)), sn.a.d(iVar, new c(22)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ReaderAppConfigResponseModel(int i10, String str, Map map, Map map2, Map map3, String str2, String str3, String str4, Long l4, Long l7, String str5, String str6, String str7, String str8, boolean z6, c1 c1Var) {
        boolean z10;
        if (3 == (i10 & 3)) {
            this.defaultVoice = str;
            this.androidNotificationChannels = map;
            if ((i10 & 4) == 0) {
                this.featureFlags = null;
            } else {
                this.featureFlags = map2;
            }
            if ((i10 & 8) == 0) {
                this.deviceFeatureFlags = null;
            } else {
                this.deviceFeatureFlags = map3;
            }
            if ((i10 & 16) == 0) {
                this.rnMinAppVersion = "9.9.9";
            } else {
                this.rnMinAppVersion = str2;
            }
            if ((i10 & 32) == 0) {
                this.androidMinAppVersion = "1.4.31";
            } else {
                this.androidMinAppVersion = str3;
            }
            if ((i10 & 64) == 0) {
                this.iosMinAppVersion = "1.4.30";
            } else {
                this.iosMinAppVersion = str4;
            }
            if ((i10 & 128) == 0) {
                this.playerBufferMaxLengthSeconds = 240L;
            } else {
                this.playerBufferMaxLengthSeconds = l4;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.playerBufferMinLengthSeconds = 30L;
            } else {
                this.playerBufferMinLengthSeconds = l7;
            }
            if ((i10 & 512) == 0) {
                this.importTutorialIosUrl = "https://www.youtube.com/watch?v=AjlybjaEF5w";
            } else {
                this.importTutorialIosUrl = str5;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.reportProblemUrl = null;
            } else {
                this.reportProblemUrl = str6;
            }
            if ((i10 & 2048) == 0) {
                this.copyrightTakedownUrl = null;
            } else {
                this.copyrightTakedownUrl = str7;
            }
            if ((i10 & 4096) == 0) {
                this.contentProviderWaitlistUrl = null;
            } else {
                this.contentProviderWaitlistUrl = str8;
            }
            if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                z10 = true;
            } else {
                z10 = z6;
            }
            this.androidRtlCanvasValidation = z10;
            return;
        }
        t0.j(i10, 3, ReaderAppConfigResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new h0(g1.f34588a, ur.g.f34583a);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static /* synthetic */ ReaderAppConfigResponseModel copy$default(ReaderAppConfigResponseModel readerAppConfigResponseModel, String str, Map map, Map map2, Map map3, String str2, String str3, String str4, Long l4, Long l7, String str5, String str6, String str7, String str8, boolean z6, int i10, Object obj) {
        String str9;
        Map map4;
        Map map5;
        Map map6;
        String str10;
        String str11;
        String str12;
        Long l10;
        Long l11;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z10;
        if ((i10 & 1) != 0) {
            str9 = readerAppConfigResponseModel.defaultVoice;
        } else {
            str9 = str;
        }
        if ((i10 & 2) != 0) {
            map4 = readerAppConfigResponseModel.androidNotificationChannels;
        } else {
            map4 = map;
        }
        if ((i10 & 4) != 0) {
            map5 = readerAppConfigResponseModel.featureFlags;
        } else {
            map5 = map2;
        }
        if ((i10 & 8) != 0) {
            map6 = readerAppConfigResponseModel.deviceFeatureFlags;
        } else {
            map6 = map3;
        }
        if ((i10 & 16) != 0) {
            str10 = readerAppConfigResponseModel.rnMinAppVersion;
        } else {
            str10 = str2;
        }
        if ((i10 & 32) != 0) {
            str11 = readerAppConfigResponseModel.androidMinAppVersion;
        } else {
            str11 = str3;
        }
        if ((i10 & 64) != 0) {
            str12 = readerAppConfigResponseModel.iosMinAppVersion;
        } else {
            str12 = str4;
        }
        if ((i10 & 128) != 0) {
            l10 = readerAppConfigResponseModel.playerBufferMaxLengthSeconds;
        } else {
            l10 = l4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            l11 = readerAppConfigResponseModel.playerBufferMinLengthSeconds;
        } else {
            l11 = l7;
        }
        if ((i10 & 512) != 0) {
            str13 = readerAppConfigResponseModel.importTutorialIosUrl;
        } else {
            str13 = str5;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str14 = readerAppConfigResponseModel.reportProblemUrl;
        } else {
            str14 = str6;
        }
        if ((i10 & 2048) != 0) {
            str15 = readerAppConfigResponseModel.copyrightTakedownUrl;
        } else {
            str15 = str7;
        }
        if ((i10 & 4096) != 0) {
            str16 = readerAppConfigResponseModel.contentProviderWaitlistUrl;
        } else {
            str16 = str8;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z10 = readerAppConfigResponseModel.androidRtlCanvasValidation;
        } else {
            z10 = z6;
        }
        return readerAppConfigResponseModel.copy(str9, map4, map5, map6, str10, str11, str12, l10, l11, str13, str14, str15, str16, z10);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderAppConfigResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        Long l4;
        Long l7;
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.defaultVoice);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.androidNotificationChannels);
        if (output.C(serialDesc) || self.featureFlags != null) {
            output.o(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.featureFlags);
        }
        if (output.C(serialDesc) || self.deviceFeatureFlags != null) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.deviceFeatureFlags);
        }
        if (output.C(serialDesc) || !m.c(self.rnMinAppVersion, "9.9.9")) {
            output.o(serialDesc, 4, g1.f34588a, self.rnMinAppVersion);
        }
        if (output.C(serialDesc) || !m.c(self.androidMinAppVersion, "1.4.31")) {
            output.o(serialDesc, 5, g1.f34588a, self.androidMinAppVersion);
        }
        if (output.C(serialDesc) || !m.c(self.iosMinAppVersion, "1.4.30")) {
            output.o(serialDesc, 6, g1.f34588a, self.iosMinAppVersion);
        }
        if (output.C(serialDesc) || (l7 = self.playerBufferMaxLengthSeconds) == null || l7.longValue() != 240) {
            output.o(serialDesc, 7, l0.f34611a, self.playerBufferMaxLengthSeconds);
        }
        if (output.C(serialDesc) || (l4 = self.playerBufferMinLengthSeconds) == null || l4.longValue() != 30) {
            output.o(serialDesc, 8, l0.f34611a, self.playerBufferMinLengthSeconds);
        }
        if (output.C(serialDesc) || !m.c(self.importTutorialIosUrl, "https://www.youtube.com/watch?v=AjlybjaEF5w")) {
            output.o(serialDesc, 9, g1.f34588a, self.importTutorialIosUrl);
        }
        if (output.C(serialDesc) || self.reportProblemUrl != null) {
            output.o(serialDesc, 10, g1.f34588a, self.reportProblemUrl);
        }
        if (output.C(serialDesc) || self.copyrightTakedownUrl != null) {
            output.o(serialDesc, 11, g1.f34588a, self.copyrightTakedownUrl);
        }
        if (output.C(serialDesc) || self.contentProviderWaitlistUrl != null) {
            output.o(serialDesc, 12, g1.f34588a, self.contentProviderWaitlistUrl);
        }
        if (output.C(serialDesc) || !self.androidRtlCanvasValidation) {
            output.T(serialDesc, 13, self.androidRtlCanvasValidation);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultVoice() {
        return this.defaultVoice;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImportTutorialIosUrl() {
        return this.importTutorialIosUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getReportProblemUrl() {
        return this.reportProblemUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCopyrightTakedownUrl() {
        return this.copyrightTakedownUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getContentProviderWaitlistUrl() {
        return this.contentProviderWaitlistUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAndroidRtlCanvasValidation() {
        return this.androidRtlCanvasValidation;
    }

    public final Map<String, String> component2() {
        return this.androidNotificationChannels;
    }

    public final Map<String, Boolean> component3() {
        return this.featureFlags;
    }

    public final Map<String, String> component4() {
        return this.deviceFeatureFlags;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRnMinAppVersion() {
        return this.rnMinAppVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAndroidMinAppVersion() {
        return this.androidMinAppVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIosMinAppVersion() {
        return this.iosMinAppVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getPlayerBufferMaxLengthSeconds() {
        return this.playerBufferMaxLengthSeconds;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getPlayerBufferMinLengthSeconds() {
        return this.playerBufferMinLengthSeconds;
    }

    public final ReaderAppConfigResponseModel copy(String defaultVoice, Map<String, String> androidNotificationChannels, Map<String, Boolean> featureFlags, Map<String, String> deviceFeatureFlags, String rnMinAppVersion, String androidMinAppVersion, String iosMinAppVersion, Long playerBufferMaxLengthSeconds, Long playerBufferMinLengthSeconds, String importTutorialIosUrl, String reportProblemUrl, String copyrightTakedownUrl, String contentProviderWaitlistUrl, boolean androidRtlCanvasValidation) {
        defaultVoice.getClass();
        androidNotificationChannels.getClass();
        return new ReaderAppConfigResponseModel(defaultVoice, androidNotificationChannels, featureFlags, deviceFeatureFlags, rnMinAppVersion, androidMinAppVersion, iosMinAppVersion, playerBufferMaxLengthSeconds, playerBufferMinLengthSeconds, importTutorialIosUrl, reportProblemUrl, copyrightTakedownUrl, contentProviderWaitlistUrl, androidRtlCanvasValidation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderAppConfigResponseModel)) {
            return false;
        }
        ReaderAppConfigResponseModel readerAppConfigResponseModel = (ReaderAppConfigResponseModel) other;
        if (m.c(this.defaultVoice, readerAppConfigResponseModel.defaultVoice) && m.c(this.androidNotificationChannels, readerAppConfigResponseModel.androidNotificationChannels) && m.c(this.featureFlags, readerAppConfigResponseModel.featureFlags) && m.c(this.deviceFeatureFlags, readerAppConfigResponseModel.deviceFeatureFlags) && m.c(this.rnMinAppVersion, readerAppConfigResponseModel.rnMinAppVersion) && m.c(this.androidMinAppVersion, readerAppConfigResponseModel.androidMinAppVersion) && m.c(this.iosMinAppVersion, readerAppConfigResponseModel.iosMinAppVersion) && m.c(this.playerBufferMaxLengthSeconds, readerAppConfigResponseModel.playerBufferMaxLengthSeconds) && m.c(this.playerBufferMinLengthSeconds, readerAppConfigResponseModel.playerBufferMinLengthSeconds) && m.c(this.importTutorialIosUrl, readerAppConfigResponseModel.importTutorialIosUrl) && m.c(this.reportProblemUrl, readerAppConfigResponseModel.reportProblemUrl) && m.c(this.copyrightTakedownUrl, readerAppConfigResponseModel.copyrightTakedownUrl) && m.c(this.contentProviderWaitlistUrl, readerAppConfigResponseModel.contentProviderWaitlistUrl) && this.androidRtlCanvasValidation == readerAppConfigResponseModel.androidRtlCanvasValidation) {
            return true;
        }
        return false;
    }

    public final String getAndroidMinAppVersion() {
        return this.androidMinAppVersion;
    }

    public final Map<String, String> getAndroidNotificationChannels() {
        return this.androidNotificationChannels;
    }

    public final boolean getAndroidRtlCanvasValidation() {
        return this.androidRtlCanvasValidation;
    }

    public final String getContentProviderWaitlistUrl() {
        return this.contentProviderWaitlistUrl;
    }

    public final String getCopyrightTakedownUrl() {
        return this.copyrightTakedownUrl;
    }

    public final String getDefaultVoice() {
        return this.defaultVoice;
    }

    public final Map<String, String> getDeviceFeatureFlags() {
        return this.deviceFeatureFlags;
    }

    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getImportTutorialIosUrl() {
        return this.importTutorialIosUrl;
    }

    public final String getIosMinAppVersion() {
        return this.iosMinAppVersion;
    }

    public final Long getPlayerBufferMaxLengthSeconds() {
        return this.playerBufferMaxLengthSeconds;
    }

    public final Long getPlayerBufferMinLengthSeconds() {
        return this.playerBufferMinLengthSeconds;
    }

    public final String getReportProblemUrl() {
        return this.reportProblemUrl;
    }

    public final String getRnMinAppVersion() {
        return this.rnMinAppVersion;
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
        int a10 = f.a(this.androidNotificationChannels, this.defaultVoice.hashCode() * 31, 31);
        Map<String, Boolean> map = this.featureFlags;
        int i10 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        Map<String, String> map2 = this.deviceFeatureFlags;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.rnMinAppVersion;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.androidMinAppVersion;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str3 = this.iosMinAppVersion;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Long l4 = this.playerBufferMaxLengthSeconds;
        if (l4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Long l7 = this.playerBufferMinLengthSeconds;
        if (l7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l7.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str4 = this.importTutorialIosUrl;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str5 = this.reportProblemUrl;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        String str6 = this.copyrightTakedownUrl;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        String str7 = this.contentProviderWaitlistUrl;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return Boolean.hashCode(this.androidRtlCanvasValidation) + ((i20 + i10) * 31);
    }

    public String toString() {
        String str = this.defaultVoice;
        Map<String, String> map = this.androidNotificationChannels;
        Map<String, Boolean> map2 = this.featureFlags;
        Map<String, String> map3 = this.deviceFeatureFlags;
        String str2 = this.rnMinAppVersion;
        String str3 = this.androidMinAppVersion;
        String str4 = this.iosMinAppVersion;
        Long l4 = this.playerBufferMaxLengthSeconds;
        Long l7 = this.playerBufferMinLengthSeconds;
        String str5 = this.importTutorialIosUrl;
        String str6 = this.reportProblemUrl;
        String str7 = this.copyrightTakedownUrl;
        String str8 = this.contentProviderWaitlistUrl;
        boolean z6 = this.androidRtlCanvasValidation;
        StringBuilder sb = new StringBuilder("ReaderAppConfigResponseModel(defaultVoice=");
        sb.append(str);
        sb.append(", androidNotificationChannels=");
        sb.append(map);
        sb.append(", featureFlags=");
        sb.append(map2);
        sb.append(", deviceFeatureFlags=");
        sb.append(map3);
        sb.append(", rnMinAppVersion=");
        f.x(sb, str2, ", androidMinAppVersion=", str3, ", iosMinAppVersion=");
        sb.append(str4);
        sb.append(", playerBufferMaxLengthSeconds=");
        sb.append(l4);
        sb.append(", playerBufferMinLengthSeconds=");
        sb.append(l7);
        sb.append(", importTutorialIosUrl=");
        sb.append(str5);
        sb.append(", reportProblemUrl=");
        f.x(sb, str6, ", copyrightTakedownUrl=", str7, ", contentProviderWaitlistUrl=");
        sb.append(str8);
        sb.append(", androidRtlCanvasValidation=");
        sb.append(z6);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderAppConfigResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAndroidMinAppVersion$annotations() {
    }

    public static /* synthetic */ void getAndroidNotificationChannels$annotations() {
    }

    public static /* synthetic */ void getAndroidRtlCanvasValidation$annotations() {
    }

    public static /* synthetic */ void getContentProviderWaitlistUrl$annotations() {
    }

    public static /* synthetic */ void getCopyrightTakedownUrl$annotations() {
    }

    public static /* synthetic */ void getDefaultVoice$annotations() {
    }

    public static /* synthetic */ void getDeviceFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getImportTutorialIosUrl$annotations() {
    }

    public static /* synthetic */ void getIosMinAppVersion$annotations() {
    }

    public static /* synthetic */ void getPlayerBufferMaxLengthSeconds$annotations() {
    }

    public static /* synthetic */ void getPlayerBufferMinLengthSeconds$annotations() {
    }

    public static /* synthetic */ void getReportProblemUrl$annotations() {
    }

    public static /* synthetic */ void getRnMinAppVersion$annotations() {
    }

    public ReaderAppConfigResponseModel(String str, Map<String, String> map, Map<String, Boolean> map2, Map<String, String> map3, String str2, String str3, String str4, Long l4, Long l7, String str5, String str6, String str7, String str8, boolean z6) {
        str.getClass();
        map.getClass();
        this.defaultVoice = str;
        this.androidNotificationChannels = map;
        this.featureFlags = map2;
        this.deviceFeatureFlags = map3;
        this.rnMinAppVersion = str2;
        this.androidMinAppVersion = str3;
        this.iosMinAppVersion = str4;
        this.playerBufferMaxLengthSeconds = l4;
        this.playerBufferMinLengthSeconds = l7;
        this.importTutorialIosUrl = str5;
        this.reportProblemUrl = str6;
        this.copyrightTakedownUrl = str7;
        this.contentProviderWaitlistUrl = str8;
        this.androidRtlCanvasValidation = z6;
    }

    public /* synthetic */ ReaderAppConfigResponseModel(String str, Map map, Map map2, Map map3, String str2, String str3, String str4, Long l4, Long l7, String str5, String str6, String str7, String str8, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this(str, map, (i10 & 4) != 0 ? null : map2, (i10 & 8) != 0 ? null : map3, (i10 & 16) != 0 ? "9.9.9" : str2, (i10 & 32) != 0 ? "1.4.31" : str3, (i10 & 64) != 0 ? "1.4.30" : str4, (i10 & 128) != 0 ? 240L : l4, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? 30L : l7, (i10 & 512) != 0 ? "https://www.youtube.com/watch?v=AjlybjaEF5w" : str5, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str6, (i10 & 2048) != 0 ? null : str7, (i10 & 4096) != 0 ? null : str8, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? true : z6);
    }
}

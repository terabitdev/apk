package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
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
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0003cdbB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017Bµ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ$\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0018\u0010,\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0012HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.JÈ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u0010\u00102\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010A\u0012\u0004\bF\u0010D\u001a\u0004\bE\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bI\u0010D\u001a\u0004\bH\u0010!R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bK\u0010D\u001a\u0004\bJ\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bM\u0010D\u001a\u0004\bL\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bO\u0010D\u001a\u0004\bN\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bQ\u0010D\u001a\u0004\bP\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bS\u0010D\u001a\u0004\bR\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bU\u0010D\u001a\u0004\bT\u0010\u001eR4\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010V\u0012\u0004\bX\u0010D\u001a\u0004\bW\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bZ\u0010D\u001a\u0004\bY\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\b\\\u0010D\u001a\u0004\b[\u0010\u001eR(\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010A\u0012\u0004\b^\u0010D\u001a\u0004\b]\u0010\u001eR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010_\u0012\u0004\ba\u0010D\u001a\u0004\b`\u0010.¨\u0006e"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "", "", "profileId", DiagnosticsEntry.NAME_KEY, "", "createdAtUnix", "updatedAtUnix", "bio", "avatarUrl", "dateOfBirth", FirebaseAnalytics.Param.ORIGIN, "websiteLink", "", "", "socialLinks", "penName", "profileSlug", "Lio/elevenlabs/data/model/ModerationStatus;", "bioModerationStatus", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "component14", "()Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;)Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getProfileId", "getProfileId$annotations", "()V", "getName", "getName$annotations", "J", "getCreatedAtUnix", "getCreatedAtUnix$annotations", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "getBio", "getBio$annotations", "getAvatarUrl", "getAvatarUrl$annotations", "getDateOfBirth", "getDateOfBirth$annotations", "getOrigin", "getOrigin$annotations", "getWebsiteLink", "getWebsiteLink$annotations", "Ljava/util/List;", "getSocialLinks", "getSocialLinks$annotations", "getPenName", "getPenName$annotations", "getProfileSlug", "getProfileSlug$annotations", "getBioModerationStatus", "getBioModerationStatus$annotations", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;", "getLanguage", "getLanguage$annotations", "Companion", "Language", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderPublisherProfileResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatarUrl;
    private final String bio;
    private final String bioModerationStatus;
    private final long createdAtUnix;
    private final String dateOfBirth;
    private final Language language;
    private final String name;
    private final String origin;
    private final String penName;
    private final String profileId;
    private final String profileSlug;
    private final List<Map<String, String>> socialLinks;
    private final long updatedAtUnix;
    private final String websiteLink;

    static {
        d dVar = new d(2);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, null, null, null, null, null, null, null, sn.a.d(iVar, dVar), null, null, sn.a.d(iVar, new d(3)), sn.a.d(iVar, new d(4))};
    }

    public /* synthetic */ ReaderPublisherProfileResponseModel(int i10, String str, String str2, long j4, long j10, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, Language language, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.profileId = str;
            this.name = str2;
            this.createdAtUnix = j4;
            this.updatedAtUnix = j10;
            if ((i10 & 16) == 0) {
                this.bio = null;
            } else {
                this.bio = str3;
            }
            if ((i10 & 32) == 0) {
                this.avatarUrl = null;
            } else {
                this.avatarUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.dateOfBirth = null;
            } else {
                this.dateOfBirth = str5;
            }
            if ((i10 & 128) == 0) {
                this.origin = null;
            } else {
                this.origin = str6;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.websiteLink = null;
            } else {
                this.websiteLink = str7;
            }
            if ((i10 & 512) == 0) {
                this.socialLinks = null;
            } else {
                this.socialLinks = list;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.penName = null;
            } else {
                this.penName = str8;
            }
            if ((i10 & 2048) == 0) {
                this.profileSlug = null;
            } else {
                this.profileSlug = str9;
            }
            if ((i10 & 4096) == 0) {
                this.bioModerationStatus = null;
            } else {
                this.bioModerationStatus = str10;
            }
            if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                this.language = null;
                return;
            } else {
                this.language = language;
                return;
            }
        }
        t0.j(i10, 15, ReaderPublisherProfileResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        g1 g1Var = g1.f34588a;
        return new ur.d(new h0(g1Var, g1Var), 0);
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(String.class), rd.c1.w(g1.f34588a), new KSerializer[0]);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return Language.INSTANCE.serializer();
    }

    public static /* synthetic */ ReaderPublisherProfileResponseModel copy$default(ReaderPublisherProfileResponseModel readerPublisherProfileResponseModel, String str, String str2, long j4, long j10, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, Language language, int i10, Object obj) {
        String str11;
        String str12;
        long j11;
        long j12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        List list2;
        String str18;
        String str19;
        String str20;
        Language language2;
        if ((i10 & 1) != 0) {
            str11 = readerPublisherProfileResponseModel.profileId;
        } else {
            str11 = str;
        }
        if ((i10 & 2) != 0) {
            str12 = readerPublisherProfileResponseModel.name;
        } else {
            str12 = str2;
        }
        if ((i10 & 4) != 0) {
            j11 = readerPublisherProfileResponseModel.createdAtUnix;
        } else {
            j11 = j4;
        }
        if ((i10 & 8) != 0) {
            j12 = readerPublisherProfileResponseModel.updatedAtUnix;
        } else {
            j12 = j10;
        }
        if ((i10 & 16) != 0) {
            str13 = readerPublisherProfileResponseModel.bio;
        } else {
            str13 = str3;
        }
        if ((i10 & 32) != 0) {
            str14 = readerPublisherProfileResponseModel.avatarUrl;
        } else {
            str14 = str4;
        }
        if ((i10 & 64) != 0) {
            str15 = readerPublisherProfileResponseModel.dateOfBirth;
        } else {
            str15 = str5;
        }
        if ((i10 & 128) != 0) {
            str16 = readerPublisherProfileResponseModel.origin;
        } else {
            str16 = str6;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str17 = readerPublisherProfileResponseModel.websiteLink;
        } else {
            str17 = str7;
        }
        if ((i10 & 512) != 0) {
            list2 = readerPublisherProfileResponseModel.socialLinks;
        } else {
            list2 = list;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str18 = readerPublisherProfileResponseModel.penName;
        } else {
            str18 = str8;
        }
        if ((i10 & 2048) != 0) {
            str19 = readerPublisherProfileResponseModel.profileSlug;
        } else {
            str19 = str9;
        }
        String str21 = str11;
        if ((i10 & 4096) != 0) {
            str20 = readerPublisherProfileResponseModel.bioModerationStatus;
        } else {
            str20 = str10;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            language2 = readerPublisherProfileResponseModel.language;
        } else {
            language2 = language;
        }
        return readerPublisherProfileResponseModel.copy(str21, str12, j11, j12, str13, str14, str15, str16, str17, list2, str18, str19, str20, language2);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderPublisherProfileResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.profileId);
        output.V(serialDesc, 1, self.name);
        output.h0(serialDesc, 2, self.createdAtUnix);
        output.h0(serialDesc, 3, self.updatedAtUnix);
        if (output.C(serialDesc) || self.bio != null) {
            output.o(serialDesc, 4, g1.f34588a, self.bio);
        }
        if (output.C(serialDesc) || self.avatarUrl != null) {
            output.o(serialDesc, 5, g1.f34588a, self.avatarUrl);
        }
        if (output.C(serialDesc) || self.dateOfBirth != null) {
            output.o(serialDesc, 6, g1.f34588a, self.dateOfBirth);
        }
        if (output.C(serialDesc) || self.origin != null) {
            output.o(serialDesc, 7, g1.f34588a, self.origin);
        }
        if (output.C(serialDesc) || self.websiteLink != null) {
            output.o(serialDesc, 8, g1.f34588a, self.websiteLink);
        }
        if (output.C(serialDesc) || self.socialLinks != null) {
            output.o(serialDesc, 9, (KSerializer) hVarArr[9].getValue(), self.socialLinks);
        }
        if (output.C(serialDesc) || self.penName != null) {
            output.o(serialDesc, 10, g1.f34588a, self.penName);
        }
        if (output.C(serialDesc) || self.profileSlug != null) {
            output.o(serialDesc, 11, g1.f34588a, self.profileSlug);
        }
        if (output.C(serialDesc) || self.bioModerationStatus != null) {
            output.o(serialDesc, 12, (KSerializer) hVarArr[12].getValue(), self.bioModerationStatus);
        }
        if (output.C(serialDesc) || self.language != null) {
            output.o(serialDesc, 13, (KSerializer) hVarArr[13].getValue(), self.language);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    public final List<Map<String, String>> component10() {
        return this.socialLinks;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPenName() {
        return this.penName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getProfileSlug() {
        return this.profileSlug;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBioModerationStatus() {
        return this.bioModerationStatus;
    }

    /* renamed from: component14, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWebsiteLink() {
        return this.websiteLink;
    }

    public final ReaderPublisherProfileResponseModel copy(String profileId, String r19, long createdAtUnix, long updatedAtUnix, String bio, String avatarUrl, String dateOfBirth, String r27, String websiteLink, List<? extends Map<String, String>> socialLinks, String penName, String profileSlug, String bioModerationStatus, Language language) {
        profileId.getClass();
        r19.getClass();
        return new ReaderPublisherProfileResponseModel(profileId, r19, createdAtUnix, updatedAtUnix, bio, avatarUrl, dateOfBirth, r27, websiteLink, socialLinks, penName, profileSlug, bioModerationStatus, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderPublisherProfileResponseModel)) {
            return false;
        }
        ReaderPublisherProfileResponseModel readerPublisherProfileResponseModel = (ReaderPublisherProfileResponseModel) other;
        if (m.c(this.profileId, readerPublisherProfileResponseModel.profileId) && m.c(this.name, readerPublisherProfileResponseModel.name) && this.createdAtUnix == readerPublisherProfileResponseModel.createdAtUnix && this.updatedAtUnix == readerPublisherProfileResponseModel.updatedAtUnix && m.c(this.bio, readerPublisherProfileResponseModel.bio) && m.c(this.avatarUrl, readerPublisherProfileResponseModel.avatarUrl) && m.c(this.dateOfBirth, readerPublisherProfileResponseModel.dateOfBirth) && m.c(this.origin, readerPublisherProfileResponseModel.origin) && m.c(this.websiteLink, readerPublisherProfileResponseModel.websiteLink) && m.c(this.socialLinks, readerPublisherProfileResponseModel.socialLinks) && m.c(this.penName, readerPublisherProfileResponseModel.penName) && m.c(this.profileSlug, readerPublisherProfileResponseModel.profileSlug) && m.c(this.bioModerationStatus, readerPublisherProfileResponseModel.bioModerationStatus) && this.language == readerPublisherProfileResponseModel.language) {
            return true;
        }
        return false;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBioModerationStatus() {
        return this.bioModerationStatus;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getPenName() {
        return this.penName;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getProfileSlug() {
        return this.profileSlug;
    }

    public final List<Map<String, String>> getSocialLinks() {
        return this.socialLinks;
    }

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final String getWebsiteLink() {
        return this.websiteLink;
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
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.updatedAtUnix, com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, j0.c.c(this.profileId.hashCode() * 31, 31, this.name), 31), 31);
        String str = this.bio;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.avatarUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.dateOfBirth;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.origin;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.websiteLink;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        List<Map<String, String>> list = this.socialLinks;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str6 = this.penName;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str7 = this.profileSlug;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str8 = this.bioModerationStatus;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Language language = this.language;
        if (language != null) {
            i10 = language.hashCode();
        }
        return i19 + i10;
    }

    public String toString() {
        String str = this.profileId;
        String str2 = this.name;
        long j4 = this.createdAtUnix;
        long j10 = this.updatedAtUnix;
        String str3 = this.bio;
        String str4 = this.avatarUrl;
        String str5 = this.dateOfBirth;
        String str6 = this.origin;
        String str7 = this.websiteLink;
        List<Map<String, String>> list = this.socialLinks;
        String str8 = this.penName;
        String str9 = this.profileSlug;
        String str10 = this.bioModerationStatus;
        Language language = this.language;
        StringBuilder s10 = f.s("ReaderPublisherProfileResponseModel(profileId=", str, ", name=", str2, ", createdAtUnix=");
        s10.append(j4);
        com.google.android.gms.internal.play_billing.b.w(s10, ", updatedAtUnix=", j10, ", bio=");
        f.x(s10, str3, ", avatarUrl=", str4, ", dateOfBirth=");
        f.x(s10, str5, ", origin=", str6, ", websiteLink=");
        s10.append(str7);
        s10.append(", socialLinks=");
        s10.append(list);
        s10.append(", penName=");
        f.x(s10, str8, ", profileSlug=", str9, ", bioModerationStatus=");
        s10.append(str10);
        s10.append(", language=");
        s10.append(language);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\b\u0087\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006)"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EN", "ZH", "ES", "HI", "PT", "FR", "DE", "JA", "AR", "RU", "KO", "ID", "IT", "NL", "TR", "PL", "SV", "FIL", "MS", "RO", "UK", "EL", "CS", "DA", "FI", "BG", "HR", "SK", "TA", "HU", "NO", "VI", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Language extends Enum<Language> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Language[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Language EN = new Language("EN", 0, "en");
        public static final Language ZH = new Language("ZH", 1, "zh");
        public static final Language ES = new Language("ES", 2, "es");
        public static final Language HI = new Language("HI", 3, "hi");
        public static final Language PT = new Language("PT", 4, "pt");
        public static final Language FR = new Language("FR", 5, "fr");
        public static final Language DE = new Language("DE", 6, "de");
        public static final Language JA = new Language("JA", 7, "ja");
        public static final Language AR = new Language("AR", 8, "ar");
        public static final Language RU = new Language("RU", 9, "ru");
        public static final Language KO = new Language("KO", 10, "ko");
        public static final Language ID = new Language("ID", 11, "id");
        public static final Language IT = new Language("IT", 12, "it");
        public static final Language NL = new Language("NL", 13, "nl");
        public static final Language TR = new Language("TR", 14, "tr");
        public static final Language PL = new Language("PL", 15, "pl");
        public static final Language SV = new Language("SV", 16, "sv");
        public static final Language FIL = new Language("FIL", 17, "fil");
        public static final Language MS = new Language("MS", 18, "ms");
        public static final Language RO = new Language("RO", 19, "ro");
        public static final Language UK = new Language("UK", 20, "uk");
        public static final Language EL = new Language("EL", 21, "el");
        public static final Language CS = new Language("CS", 22, "cs");
        public static final Language DA = new Language("DA", 23, "da");
        public static final Language FI = new Language("FI", 24, "fi");
        public static final Language BG = new Language("BG", 25, "bg");
        public static final Language HR = new Language("HR", 26, "hr");
        public static final Language SK = new Language("SK", 27, "sk");
        public static final Language TA = new Language("TA", 28, "ta");
        public static final Language HU = new Language("HU", 29, "hu");
        public static final Language NO = new Language("NO", 30, AuthorizationHeaderIms.NO);
        public static final Language VI = new Language("VI", 31, "vi");

        private static final /* synthetic */ Language[] $values() {
            return new Language[]{EN, ZH, ES, HI, PT, FR, DE, JA, AR, RU, KO, ID, IT, NL, TR, PL, SV, FIL, MS, RO, UK, EL, CS, DA, FI, BG, HR, SK, TA, HU, NO, VI};
        }

        static {
            Language[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new d(5));
        }

        private Language(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel.Language", values(), new String[]{"en", "zh", "es", "hi", "pt", "fr", "de", "ja", "ar", "ru", "ko", "id", "it", "nl", "tr", "pl", "sv", "fil", "ms", "ro", "uk", "el", "cs", "da", "fi", "bg", "hr", "sk", "ta", "hu", AuthorizationHeaderIms.NO, "vi"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Language valueOf(String str) {
            return (Language) Enum.valueOf(Language.class, str);
        }

        public static Language[] values() {
            return (Language[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Language;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Language.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderPublisherProfileResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getBio$annotations() {
    }

    public static /* synthetic */ void getBioModerationStatus$annotations() {
    }

    public static /* synthetic */ void getCreatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getDateOfBirth$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOrigin$annotations() {
    }

    public static /* synthetic */ void getPenName$annotations() {
    }

    public static /* synthetic */ void getProfileId$annotations() {
    }

    public static /* synthetic */ void getProfileSlug$annotations() {
    }

    public static /* synthetic */ void getSocialLinks$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getWebsiteLink$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReaderPublisherProfileResponseModel(String str, String str2, long j4, long j10, String str3, String str4, String str5, String str6, String str7, List<? extends Map<String, String>> list, String str8, String str9, String str10, Language language) {
        str.getClass();
        str2.getClass();
        this.profileId = str;
        this.name = str2;
        this.createdAtUnix = j4;
        this.updatedAtUnix = j10;
        this.bio = str3;
        this.avatarUrl = str4;
        this.dateOfBirth = str5;
        this.origin = str6;
        this.websiteLink = str7;
        this.socialLinks = list;
        this.penName = str8;
        this.profileSlug = str9;
        this.bioModerationStatus = str10;
        this.language = language;
    }

    public /* synthetic */ ReaderPublisherProfileResponseModel(String str, String str2, long j4, long j10, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, Language language, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, j4, j10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str7, (i10 & 512) != 0 ? null : list, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str8, (i10 & 2048) != 0 ? null : str9, (i10 & 4096) != 0 ? null : str10, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : language);
    }
}

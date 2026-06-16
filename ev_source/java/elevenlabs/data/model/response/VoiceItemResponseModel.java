package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import qr.g;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0002edB¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B¹\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ¼\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010@\u0012\u0004\bE\u0010C\u001a\u0004\bD\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bG\u0010C\u001a\u0004\bF\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bK\u0010C\u001a\u0004\bJ\u0010\u001dR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bM\u0010C\u001a\u0004\bL\u0010\u001dR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bO\u0010C\u001a\u0004\bN\u0010\u001dR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bQ\u0010C\u001a\u0004\bP\u0010\u001dR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010R\u0012\u0004\bT\u0010C\u001a\u0004\bS\u0010&R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bV\u0010C\u001a\u0004\bU\u0010\u001dR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010W\u0012\u0004\bY\u0010C\u001a\u0004\bX\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010W\u0012\u0004\b[\u0010C\u001a\u0004\bZ\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\b]\u0010C\u001a\u0004\b\\\u0010\u001dR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\b_\u0010C\u001a\u0004\b^\u0010\u001dR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\ba\u0010C\u001a\u0004\b`\u0010\u001dR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010@\u0012\u0004\bc\u0010C\u001a\u0004\bb\u0010\u001d¨\u0006f"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "", "", "voiceId", DiagnosticsEntry.NAME_KEY, "accent", "gender", "age", "descriptive", "useCase", "language", "", "fromVoiceLibrary", "category", "", "favoritedAtUnix", "createdAtUnix", "description", "previewUrl", "imageUrl", "ownerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "()Ljava/lang/Long;", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/VoiceItemResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getVoiceId", "getVoiceId$annotations", "()V", "getName", "getName$annotations", "getAccent", "getAccent$annotations", "getGender", "getGender$annotations", "getAge", "getAge$annotations", "getDescriptive", "getDescriptive$annotations", "getUseCase", "getUseCase$annotations", "getLanguage", "getLanguage$annotations", "Z", "getFromVoiceLibrary", "getFromVoiceLibrary$annotations", "getCategory", "getCategory$annotations", "Ljava/lang/Long;", "getFavoritedAtUnix", "getFavoritedAtUnix$annotations", "getCreatedAtUnix", "getCreatedAtUnix$annotations", "getDescription", "getDescription$annotations", "getPreviewUrl", "getPreviewUrl$annotations", "getImageUrl", "getImageUrl$annotations", "getOwnerId", "getOwnerId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class VoiceItemResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accent;
    private final String age;
    private final String category;
    private final Long createdAtUnix;
    private final String description;
    private final String descriptive;
    private final Long favoritedAtUnix;
    private final boolean fromVoiceLibrary;
    private final String gender;
    private final String imageUrl;
    private final String language;
    private final String name;
    private final String ownerId;
    private final String previewUrl;
    private final String useCase;
    private final String voiceId;

    public /* synthetic */ VoiceItemResponseModel(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, Long l4, Long l7, String str10, String str11, String str12, String str13, c1 c1Var) {
        if (511 == (i10 & 511)) {
            this.voiceId = str;
            this.name = str2;
            this.accent = str3;
            this.gender = str4;
            this.age = str5;
            this.descriptive = str6;
            this.useCase = str7;
            this.language = str8;
            this.fromVoiceLibrary = z6;
            if ((i10 & 512) == 0) {
                this.category = "user";
            } else {
                this.category = str9;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.favoritedAtUnix = null;
            } else {
                this.favoritedAtUnix = l4;
            }
            if ((i10 & 2048) == 0) {
                this.createdAtUnix = null;
            } else {
                this.createdAtUnix = l7;
            }
            if ((i10 & 4096) == 0) {
                this.description = null;
            } else {
                this.description = str10;
            }
            if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                this.previewUrl = null;
            } else {
                this.previewUrl = str11;
            }
            if ((i10 & 16384) == 0) {
                this.imageUrl = null;
            } else {
                this.imageUrl = str12;
            }
            if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0) {
                this.ownerId = null;
                return;
            } else {
                this.ownerId = str13;
                return;
            }
        }
        t0.j(i10, 511, VoiceItemResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ VoiceItemResponseModel copy$default(VoiceItemResponseModel voiceItemResponseModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, Long l4, Long l7, String str10, String str11, String str12, String str13, int i10, Object obj) {
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        boolean z10;
        String str22;
        Long l10;
        Long l11;
        String str23;
        String str24;
        String str25;
        String str26;
        if ((i10 & 1) != 0) {
            str14 = voiceItemResponseModel.voiceId;
        } else {
            str14 = str;
        }
        if ((i10 & 2) != 0) {
            str15 = voiceItemResponseModel.name;
        } else {
            str15 = str2;
        }
        if ((i10 & 4) != 0) {
            str16 = voiceItemResponseModel.accent;
        } else {
            str16 = str3;
        }
        if ((i10 & 8) != 0) {
            str17 = voiceItemResponseModel.gender;
        } else {
            str17 = str4;
        }
        if ((i10 & 16) != 0) {
            str18 = voiceItemResponseModel.age;
        } else {
            str18 = str5;
        }
        if ((i10 & 32) != 0) {
            str19 = voiceItemResponseModel.descriptive;
        } else {
            str19 = str6;
        }
        if ((i10 & 64) != 0) {
            str20 = voiceItemResponseModel.useCase;
        } else {
            str20 = str7;
        }
        if ((i10 & 128) != 0) {
            str21 = voiceItemResponseModel.language;
        } else {
            str21 = str8;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            z10 = voiceItemResponseModel.fromVoiceLibrary;
        } else {
            z10 = z6;
        }
        if ((i10 & 512) != 0) {
            str22 = voiceItemResponseModel.category;
        } else {
            str22 = str9;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            l10 = voiceItemResponseModel.favoritedAtUnix;
        } else {
            l10 = l4;
        }
        if ((i10 & 2048) != 0) {
            l11 = voiceItemResponseModel.createdAtUnix;
        } else {
            l11 = l7;
        }
        if ((i10 & 4096) != 0) {
            str23 = voiceItemResponseModel.description;
        } else {
            str23 = str10;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str24 = voiceItemResponseModel.previewUrl;
        } else {
            str24 = str11;
        }
        String str27 = str14;
        if ((i10 & 16384) != 0) {
            str25 = voiceItemResponseModel.imageUrl;
        } else {
            str25 = str12;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            str26 = voiceItemResponseModel.ownerId;
        } else {
            str26 = str13;
        }
        return voiceItemResponseModel.copy(str27, str15, str16, str17, str18, str19, str20, str21, z10, str22, l10, l11, str23, str24, str25, str26);
    }

    public static final /* synthetic */ void write$Self$data_release(VoiceItemResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.voiceId);
        output.V(serialDesc, 1, self.name);
        output.V(serialDesc, 2, self.accent);
        output.V(serialDesc, 3, self.gender);
        output.V(serialDesc, 4, self.age);
        output.V(serialDesc, 5, self.descriptive);
        output.V(serialDesc, 6, self.useCase);
        output.V(serialDesc, 7, self.language);
        output.T(serialDesc, 8, self.fromVoiceLibrary);
        if (output.C(serialDesc) || !m.c(self.category, "user")) {
            output.V(serialDesc, 9, self.category);
        }
        if (output.C(serialDesc) || self.favoritedAtUnix != null) {
            output.o(serialDesc, 10, l0.f34611a, self.favoritedAtUnix);
        }
        if (output.C(serialDesc) || self.createdAtUnix != null) {
            output.o(serialDesc, 11, l0.f34611a, self.createdAtUnix);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.o(serialDesc, 12, g1.f34588a, self.description);
        }
        if (output.C(serialDesc) || self.previewUrl != null) {
            output.o(serialDesc, 13, g1.f34588a, self.previewUrl);
        }
        if (output.C(serialDesc) || self.imageUrl != null) {
            output.o(serialDesc, 14, g1.f34588a, self.imageUrl);
        }
        if (output.C(serialDesc) || self.ownerId != null) {
            output.o(serialDesc, 15, g1.f34588a, self.ownerId);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getFavoritedAtUnix() {
        return this.favoritedAtUnix;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccent() {
        return this.accent;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescriptive() {
        return this.descriptive;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUseCase() {
        return this.useCase;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFromVoiceLibrary() {
        return this.fromVoiceLibrary;
    }

    public final VoiceItemResponseModel copy(String voiceId, String name, String accent, String gender, String age, String descriptive, String useCase, String language, boolean fromVoiceLibrary, String category, Long favoritedAtUnix, Long createdAtUnix, String description, String previewUrl, String imageUrl, String ownerId) {
        j0.c.v(voiceId, name, accent, gender, age);
        descriptive.getClass();
        useCase.getClass();
        language.getClass();
        category.getClass();
        return new VoiceItemResponseModel(voiceId, name, accent, gender, age, descriptive, useCase, language, fromVoiceLibrary, category, favoritedAtUnix, createdAtUnix, description, previewUrl, imageUrl, ownerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceItemResponseModel)) {
            return false;
        }
        VoiceItemResponseModel voiceItemResponseModel = (VoiceItemResponseModel) other;
        if (m.c(this.voiceId, voiceItemResponseModel.voiceId) && m.c(this.name, voiceItemResponseModel.name) && m.c(this.accent, voiceItemResponseModel.accent) && m.c(this.gender, voiceItemResponseModel.gender) && m.c(this.age, voiceItemResponseModel.age) && m.c(this.descriptive, voiceItemResponseModel.descriptive) && m.c(this.useCase, voiceItemResponseModel.useCase) && m.c(this.language, voiceItemResponseModel.language) && this.fromVoiceLibrary == voiceItemResponseModel.fromVoiceLibrary && m.c(this.category, voiceItemResponseModel.category) && m.c(this.favoritedAtUnix, voiceItemResponseModel.favoritedAtUnix) && m.c(this.createdAtUnix, voiceItemResponseModel.createdAtUnix) && m.c(this.description, voiceItemResponseModel.description) && m.c(this.previewUrl, voiceItemResponseModel.previewUrl) && m.c(this.imageUrl, voiceItemResponseModel.imageUrl) && m.c(this.ownerId, voiceItemResponseModel.ownerId)) {
            return true;
        }
        return false;
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptive() {
        return this.descriptive;
    }

    public final Long getFavoritedAtUnix() {
        return this.favoritedAtUnix;
    }

    public final boolean getFromVoiceLibrary() {
        return this.fromVoiceLibrary;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getUseCase() {
        return this.useCase;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int c5 = j0.c.c(com.google.android.gms.internal.play_billing.b.f(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(this.voiceId.hashCode() * 31, 31, this.name), 31, this.accent), 31, this.gender), 31, this.age), 31, this.descriptive), 31, this.useCase), 31, this.language), 31, this.fromVoiceLibrary), 31, this.category);
        Long l4 = this.favoritedAtUnix;
        int i10 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        Long l7 = this.createdAtUnix;
        if (l7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l7.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.description;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.previewUrl;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str3 = this.imageUrl;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str4 = this.ownerId;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        String str = this.voiceId;
        String str2 = this.name;
        String str3 = this.accent;
        String str4 = this.gender;
        String str5 = this.age;
        String str6 = this.descriptive;
        String str7 = this.useCase;
        String str8 = this.language;
        boolean z6 = this.fromVoiceLibrary;
        String str9 = this.category;
        Long l4 = this.favoritedAtUnix;
        Long l7 = this.createdAtUnix;
        String str10 = this.description;
        String str11 = this.previewUrl;
        String str12 = this.imageUrl;
        String str13 = this.ownerId;
        StringBuilder s10 = f.s("VoiceItemResponseModel(voiceId=", str, ", name=", str2, ", accent=");
        f.x(s10, str3, ", gender=", str4, ", age=");
        f.x(s10, str5, ", descriptive=", str6, ", useCase=");
        f.x(s10, str7, ", language=", str8, ", fromVoiceLibrary=");
        f.z(s10, z6, ", category=", str9, ", favoritedAtUnix=");
        s10.append(l4);
        s10.append(", createdAtUnix=");
        s10.append(l7);
        s10.append(", description=");
        f.x(s10, str10, ", previewUrl=", str11, ", imageUrl=");
        return f.n(s10, str12, ", ownerId=", str13, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceItemResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return VoiceItemResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAccent$annotations() {
    }

    public static /* synthetic */ void getAge$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCreatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getDescriptive$annotations() {
    }

    public static /* synthetic */ void getFavoritedAtUnix$annotations() {
    }

    public static /* synthetic */ void getFromVoiceLibrary$annotations() {
    }

    public static /* synthetic */ void getGender$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOwnerId$annotations() {
    }

    public static /* synthetic */ void getPreviewUrl$annotations() {
    }

    public static /* synthetic */ void getUseCase$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public VoiceItemResponseModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, Long l4, Long l7, String str10, String str11, String str12, String str13) {
        j0.c.v(str, str2, str3, str4, str5);
        j0.c.u(str6, str7, str8, str9);
        this.voiceId = str;
        this.name = str2;
        this.accent = str3;
        this.gender = str4;
        this.age = str5;
        this.descriptive = str6;
        this.useCase = str7;
        this.language = str8;
        this.fromVoiceLibrary = z6;
        this.category = str9;
        this.favoritedAtUnix = l4;
        this.createdAtUnix = l7;
        this.description = str10;
        this.previewUrl = str11;
        this.imageUrl = str12;
        this.ownerId = str13;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ VoiceItemResponseModel(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.Long r30, java.lang.Long r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.f r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto La
            java.lang.String r1 = "user"
            r12 = r1
            goto Lc
        La:
            r12 = r29
        Lc:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L13
            r13 = r2
            goto L15
        L13:
            r13 = r30
        L15:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L1b
            r14 = r2
            goto L1d
        L1b:
            r14 = r31
        L1d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L23
            r15 = r2
            goto L25
        L23:
            r15 = r32
        L25:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L2c
            r16 = r2
            goto L2e
        L2c:
            r16 = r33
        L2e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L35
            r17 = r2
            goto L37
        L35:
            r17 = r34
        L37:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L54
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r2 = r19
            goto L6a
        L54:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
        L6a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.model.response.VoiceItemResponseModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}

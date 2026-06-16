package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J¼\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010>J\u0014\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010A\u001a\u00020BHÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*¨\u0006D"}, d2 = {"Lio/elevenlabs/domain/model/Voice;", "", "ownerId", "", "voiceId", DiagnosticsEntry.NAME_KEY, "description", "subtitle", "age", "accent", "gender", "descriptive", "useCase", "fromVoiceLibrary", "", "previewUrl", "imageUrl", "category", "Lio/elevenlabs/domain/model/VoiceCategory;", "favoritedAtUnix", "", "createdAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/VoiceCategory;Ljava/lang/Long;Ljava/lang/Long;)V", "getOwnerId", "()Ljava/lang/String;", "getVoiceId", "getName", "getDescription", "getSubtitle", "getAge", "getAccent", "getGender", "getDescriptive", "getUseCase", "getFromVoiceLibrary", "()Z", "getPreviewUrl", "getImageUrl", "getCategory", "()Lio/elevenlabs/domain/model/VoiceCategory;", "getFavoritedAtUnix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreatedAtUnix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/VoiceCategory;Ljava/lang/Long;Ljava/lang/Long;)Lio/elevenlabs/domain/model/Voice;", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Voice {
    private final String accent;
    private final String age;
    private final VoiceCategory category;
    private final Long createdAtUnix;
    private final String description;
    private final String descriptive;
    private final Long favoritedAtUnix;
    private final boolean fromVoiceLibrary;
    private final String gender;
    private final String imageUrl;
    private final String name;
    private final String ownerId;
    private final String previewUrl;
    private final String subtitle;
    private final String useCase;
    private final String voiceId;

    public Voice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z6, String str11, String str12, VoiceCategory voiceCategory, Long l4, Long l7) {
        c.v(str2, str3, str6, str7, str8);
        str9.getClass();
        str10.getClass();
        voiceCategory.getClass();
        this.ownerId = str;
        this.voiceId = str2;
        this.name = str3;
        this.description = str4;
        this.subtitle = str5;
        this.age = str6;
        this.accent = str7;
        this.gender = str8;
        this.descriptive = str9;
        this.useCase = str10;
        this.fromVoiceLibrary = z6;
        this.previewUrl = str11;
        this.imageUrl = str12;
        this.category = voiceCategory;
        this.favoritedAtUnix = l4;
        this.createdAtUnix = l7;
    }

    public static /* synthetic */ Voice copy$default(Voice voice, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z6, String str11, String str12, VoiceCategory voiceCategory, Long l4, Long l7, int i10, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        boolean z10;
        String str23;
        String str24;
        VoiceCategory voiceCategory2;
        Long l10;
        Long l11;
        if ((i10 & 1) != 0) {
            str13 = voice.ownerId;
        } else {
            str13 = str;
        }
        if ((i10 & 2) != 0) {
            str14 = voice.voiceId;
        } else {
            str14 = str2;
        }
        if ((i10 & 4) != 0) {
            str15 = voice.name;
        } else {
            str15 = str3;
        }
        if ((i10 & 8) != 0) {
            str16 = voice.description;
        } else {
            str16 = str4;
        }
        if ((i10 & 16) != 0) {
            str17 = voice.subtitle;
        } else {
            str17 = str5;
        }
        if ((i10 & 32) != 0) {
            str18 = voice.age;
        } else {
            str18 = str6;
        }
        if ((i10 & 64) != 0) {
            str19 = voice.accent;
        } else {
            str19 = str7;
        }
        if ((i10 & 128) != 0) {
            str20 = voice.gender;
        } else {
            str20 = str8;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str21 = voice.descriptive;
        } else {
            str21 = str9;
        }
        if ((i10 & 512) != 0) {
            str22 = voice.useCase;
        } else {
            str22 = str10;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z10 = voice.fromVoiceLibrary;
        } else {
            z10 = z6;
        }
        if ((i10 & 2048) != 0) {
            str23 = voice.previewUrl;
        } else {
            str23 = str11;
        }
        if ((i10 & 4096) != 0) {
            str24 = voice.imageUrl;
        } else {
            str24 = str12;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            voiceCategory2 = voice.category;
        } else {
            voiceCategory2 = voiceCategory;
        }
        String str25 = str13;
        if ((i10 & 16384) != 0) {
            l10 = voice.favoritedAtUnix;
        } else {
            l10 = l4;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            l11 = voice.createdAtUnix;
        } else {
            l11 = l7;
        }
        return voice.copy(str25, str14, str15, str16, str17, str18, str19, str20, str21, str22, z10, str23, str24, voiceCategory2, l10, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUseCase() {
        return this.useCase;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getFromVoiceLibrary() {
        return this.fromVoiceLibrary;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final VoiceCategory getCategory() {
        return this.category;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getFavoritedAtUnix() {
        return this.favoritedAtUnix;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccent() {
        return this.accent;
    }

    /* renamed from: component8, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDescriptive() {
        return this.descriptive;
    }

    public final Voice copy(String ownerId, String voiceId, String name, String description, String subtitle, String age, String accent, String gender, String descriptive, String useCase, boolean fromVoiceLibrary, String previewUrl, String imageUrl, VoiceCategory category, Long favoritedAtUnix, Long createdAtUnix) {
        c.v(voiceId, name, age, accent, gender);
        descriptive.getClass();
        useCase.getClass();
        category.getClass();
        return new Voice(ownerId, voiceId, name, description, subtitle, age, accent, gender, descriptive, useCase, fromVoiceLibrary, previewUrl, imageUrl, category, favoritedAtUnix, createdAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Voice)) {
            return false;
        }
        Voice voice = (Voice) other;
        if (m.c(this.ownerId, voice.ownerId) && m.c(this.voiceId, voice.voiceId) && m.c(this.name, voice.name) && m.c(this.description, voice.description) && m.c(this.subtitle, voice.subtitle) && m.c(this.age, voice.age) && m.c(this.accent, voice.accent) && m.c(this.gender, voice.gender) && m.c(this.descriptive, voice.descriptive) && m.c(this.useCase, voice.useCase) && this.fromVoiceLibrary == voice.fromVoiceLibrary && m.c(this.previewUrl, voice.previewUrl) && m.c(this.imageUrl, voice.imageUrl) && this.category == voice.category && m.c(this.favoritedAtUnix, voice.favoritedAtUnix) && m.c(this.createdAtUnix, voice.createdAtUnix)) {
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

    public final VoiceCategory getCategory() {
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

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
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
        int hashCode6;
        String str = this.ownerId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c5 = c.c(c.c(hashCode * 31, 31, this.voiceId), 31, this.name);
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str3 = this.subtitle;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int f10 = b.f(c.c(c.c(c.c(c.c(c.c((i11 + hashCode3) * 31, 31, this.age), 31, this.accent), 31, this.gender), 31, this.descriptive), 31, this.useCase), 31, this.fromVoiceLibrary);
        String str4 = this.previewUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (f10 + hashCode4) * 31;
        String str5 = this.imageUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode7 = (this.category.hashCode() + ((i12 + hashCode5) * 31)) * 31;
        Long l4 = this.favoritedAtUnix;
        if (l4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l4.hashCode();
        }
        int i13 = (hashCode7 + hashCode6) * 31;
        Long l7 = this.createdAtUnix;
        if (l7 != null) {
            i10 = l7.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.ownerId;
        String str2 = this.voiceId;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.subtitle;
        String str6 = this.age;
        String str7 = this.accent;
        String str8 = this.gender;
        String str9 = this.descriptive;
        String str10 = this.useCase;
        boolean z6 = this.fromVoiceLibrary;
        String str11 = this.previewUrl;
        String str12 = this.imageUrl;
        VoiceCategory voiceCategory = this.category;
        Long l4 = this.favoritedAtUnix;
        Long l7 = this.createdAtUnix;
        StringBuilder s10 = f.s("Voice(ownerId=", str, ", voiceId=", str2, ", name=");
        f.x(s10, str3, ", description=", str4, ", subtitle=");
        f.x(s10, str5, ", age=", str6, ", accent=");
        f.x(s10, str7, ", gender=", str8, ", descriptive=");
        f.x(s10, str9, ", useCase=", str10, ", fromVoiceLibrary=");
        f.z(s10, z6, ", previewUrl=", str11, ", imageUrl=");
        s10.append(str12);
        s10.append(", category=");
        s10.append(voiceCategory);
        s10.append(", favoritedAtUnix=");
        s10.append(l4);
        s10.append(", createdAtUnix=");
        s10.append(l7);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public /* synthetic */ Voice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z6, String str11, String str12, VoiceCategory voiceCategory, Long l4, Long l7, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z6, str11, str12, voiceCategory, l4, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : l7);
    }
}

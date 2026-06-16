package io.elevenlabs.data.database.entities.voices;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ib.i;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J¼\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010<J\u0014\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010?\u001a\u00020@HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(¨\u0006B"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "voiceId", "", "ownerId", DiagnosticsEntry.NAME_KEY, "accent", "gender", "age", "descriptive", "useCase", "category", "fromVoiceLibrary", "", "subtitle", "description", "previewUrl", "imageUrl", "favoritedAtUnix", "", "createdAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getVoiceId", "()Ljava/lang/String;", "getOwnerId", "getName", "getAccent", "getGender", "getAge", "getDescriptive", "getUseCase", "getCategory", "getFromVoiceLibrary", "()Z", "getSubtitle", "getDescription", "getPreviewUrl", "getImageUrl", "getFavoritedAtUnix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreatedAtUnix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoiceEntity {
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
    private final String name;
    private final String ownerId;
    private final String previewUrl;
    private final String subtitle;
    private final String useCase;
    private final String voiceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VoiceEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z6, String str10, String str11, String str12, String str13, Long l4, Long l7, int i10, f fVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, z6, str10, str11, str12, str13, l4, r17);
        Long l10;
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            l10 = null;
        } else {
            l10 = l7;
        }
    }

    public static /* synthetic */ VoiceEntity copy$default(VoiceEntity voiceEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z6, String str10, String str11, String str12, String str13, Long l4, Long l7, int i10, Object obj) {
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
        String str25;
        String str26;
        Long l10;
        Long l11;
        if ((i10 & 1) != 0) {
            str14 = voiceEntity.voiceId;
        } else {
            str14 = str;
        }
        if ((i10 & 2) != 0) {
            str15 = voiceEntity.ownerId;
        } else {
            str15 = str2;
        }
        if ((i10 & 4) != 0) {
            str16 = voiceEntity.name;
        } else {
            str16 = str3;
        }
        if ((i10 & 8) != 0) {
            str17 = voiceEntity.accent;
        } else {
            str17 = str4;
        }
        if ((i10 & 16) != 0) {
            str18 = voiceEntity.gender;
        } else {
            str18 = str5;
        }
        if ((i10 & 32) != 0) {
            str19 = voiceEntity.age;
        } else {
            str19 = str6;
        }
        if ((i10 & 64) != 0) {
            str20 = voiceEntity.descriptive;
        } else {
            str20 = str7;
        }
        if ((i10 & 128) != 0) {
            str21 = voiceEntity.useCase;
        } else {
            str21 = str8;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str22 = voiceEntity.category;
        } else {
            str22 = str9;
        }
        if ((i10 & 512) != 0) {
            z10 = voiceEntity.fromVoiceLibrary;
        } else {
            z10 = z6;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str23 = voiceEntity.subtitle;
        } else {
            str23 = str10;
        }
        if ((i10 & 2048) != 0) {
            str24 = voiceEntity.description;
        } else {
            str24 = str11;
        }
        if ((i10 & 4096) != 0) {
            str25 = voiceEntity.previewUrl;
        } else {
            str25 = str12;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str26 = voiceEntity.imageUrl;
        } else {
            str26 = str13;
        }
        String str27 = str14;
        if ((i10 & 16384) != 0) {
            l10 = voiceEntity.favoritedAtUnix;
        } else {
            l10 = l4;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            l11 = voiceEntity.createdAtUnix;
        } else {
            l11 = l7;
        }
        return voiceEntity.copy(str27, str15, str16, str17, str18, str19, str20, str21, str22, z10, str23, str24, str25, str26, l10, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getFromVoiceLibrary() {
        return this.fromVoiceLibrary;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccent() {
        return this.accent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescriptive() {
        return this.descriptive;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUseCase() {
        return this.useCase;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final VoiceEntity copy(String voiceId, String ownerId, String name, String accent, String gender, String age, String descriptive, String useCase, String category, boolean fromVoiceLibrary, String subtitle, String description, String previewUrl, String imageUrl, Long favoritedAtUnix, Long createdAtUnix) {
        j0.c.v(voiceId, name, accent, gender, age);
        descriptive.getClass();
        useCase.getClass();
        category.getClass();
        return new VoiceEntity(voiceId, ownerId, name, accent, gender, age, descriptive, useCase, category, fromVoiceLibrary, subtitle, description, previewUrl, imageUrl, favoritedAtUnix, createdAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEntity)) {
            return false;
        }
        VoiceEntity voiceEntity = (VoiceEntity) other;
        if (m.c(this.voiceId, voiceEntity.voiceId) && m.c(this.ownerId, voiceEntity.ownerId) && m.c(this.name, voiceEntity.name) && m.c(this.accent, voiceEntity.accent) && m.c(this.gender, voiceEntity.gender) && m.c(this.age, voiceEntity.age) && m.c(this.descriptive, voiceEntity.descriptive) && m.c(this.useCase, voiceEntity.useCase) && m.c(this.category, voiceEntity.category) && this.fromVoiceLibrary == voiceEntity.fromVoiceLibrary && m.c(this.subtitle, voiceEntity.subtitle) && m.c(this.description, voiceEntity.description) && m.c(this.previewUrl, voiceEntity.previewUrl) && m.c(this.imageUrl, voiceEntity.imageUrl) && m.c(this.favoritedAtUnix, voiceEntity.favoritedAtUnix) && m.c(this.createdAtUnix, voiceEntity.createdAtUnix)) {
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
        int hashCode7 = this.voiceId.hashCode() * 31;
        String str = this.ownerId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c((hashCode7 + hashCode) * 31, 31, this.name), 31, this.accent), 31, this.gender), 31, this.age), 31, this.descriptive), 31, this.useCase), 31, this.category), 31, this.fromVoiceLibrary);
        String str2 = this.subtitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.previewUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.imageUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Long l4 = this.favoritedAtUnix;
        if (l4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Long l7 = this.createdAtUnix;
        if (l7 != null) {
            i10 = l7.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        String str = this.voiceId;
        String str2 = this.ownerId;
        String str3 = this.name;
        String str4 = this.accent;
        String str5 = this.gender;
        String str6 = this.age;
        String str7 = this.descriptive;
        String str8 = this.useCase;
        String str9 = this.category;
        boolean z6 = this.fromVoiceLibrary;
        String str10 = this.subtitle;
        String str11 = this.description;
        String str12 = this.previewUrl;
        String str13 = this.imageUrl;
        Long l4 = this.favoritedAtUnix;
        Long l7 = this.createdAtUnix;
        StringBuilder s10 = defpackage.f.s("VoiceEntity(voiceId=", str, ", ownerId=", str2, ", name=");
        defpackage.f.x(s10, str3, ", accent=", str4, ", gender=");
        defpackage.f.x(s10, str5, ", age=", str6, ", descriptive=");
        defpackage.f.x(s10, str7, ", useCase=", str8, ", category=");
        defpackage.f.y(s10, str9, ", fromVoiceLibrary=", z6, ", subtitle=");
        defpackage.f.x(s10, str10, ", description=", str11, ", previewUrl=");
        defpackage.f.x(s10, str12, ", imageUrl=", str13, ", favoritedAtUnix=");
        s10.append(l4);
        s10.append(", createdAtUnix=");
        s10.append(l7);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public VoiceEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z6, String str10, String str11, String str12, String str13, Long l4, Long l7) {
        j0.c.v(str, str3, str4, str5, str6);
        i.s(str7, str8, str9);
        this.voiceId = str;
        this.ownerId = str2;
        this.name = str3;
        this.accent = str4;
        this.gender = str5;
        this.age = str6;
        this.descriptive = str7;
        this.useCase = str8;
        this.category = str9;
        this.fromVoiceLibrary = z6;
        this.subtitle = str10;
        this.description = str11;
        this.previewUrl = str12;
        this.imageUrl = str13;
        this.favoritedAtUnix = l4;
        this.createdAtUnix = l7;
    }
}

package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.d;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0014R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0014R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0014R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b>\u00101\u001a\u0004\b=\u0010\u001b¨\u0006A"}, d2 = {"Lio/elevenlabs/data/model/ReaderSoundscape;", "", "", "soundscapeId", DiagnosticsEntry.NAME_KEY, "mp3Url", "mp3Checksum", "category", "iconUrl", "", "Lio/elevenlabs/data/model/ReaderSoundscapeAudioFile;", "audioFiles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/ReaderSoundscape;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReaderSoundscape;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getSoundscapeId", "getSoundscapeId$annotations", "()V", "getName", "getName$annotations", "getMp3Url", "getMp3Url$annotations", "getMp3Checksum", "getMp3Checksum$annotations", "getCategory", "getCategory$annotations", "getIconUrl", "getIconUrl$annotations", "Ljava/util/List;", "getAudioFiles", "getAudioFiles$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderSoundscape {
    private final List<ReaderSoundscapeAudioFile> audioFiles;
    private final String category;
    private final String iconUrl;
    private final String mp3Checksum;
    private final String mp3Url;
    private final String name;
    private final String soundscapeId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(22))};

    public /* synthetic */ ReaderSoundscape(int i10, String str, String str2, String str3, String str4, String str5, String str6, List list, c1 c1Var) {
        if (63 == (i10 & 63)) {
            this.soundscapeId = str;
            this.name = str2;
            this.mp3Url = str3;
            this.mp3Checksum = str4;
            this.category = str5;
            this.iconUrl = str6;
            if ((i10 & 64) == 0) {
                this.audioFiles = null;
                return;
            } else {
                this.audioFiles = list;
                return;
            }
        }
        t0.j(i10, 63, ReaderSoundscape$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ReaderSoundscapeAudioFile$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ReaderSoundscape copy$default(ReaderSoundscape readerSoundscape, String str, String str2, String str3, String str4, String str5, String str6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readerSoundscape.soundscapeId;
        }
        if ((i10 & 2) != 0) {
            str2 = readerSoundscape.name;
        }
        if ((i10 & 4) != 0) {
            str3 = readerSoundscape.mp3Url;
        }
        if ((i10 & 8) != 0) {
            str4 = readerSoundscape.mp3Checksum;
        }
        if ((i10 & 16) != 0) {
            str5 = readerSoundscape.category;
        }
        if ((i10 & 32) != 0) {
            str6 = readerSoundscape.iconUrl;
        }
        if ((i10 & 64) != 0) {
            list = readerSoundscape.audioFiles;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return readerSoundscape.copy(str, str2, str9, str4, str8, str7, list2);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderSoundscape self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.soundscapeId);
        output.V(serialDesc, 1, self.name);
        output.V(serialDesc, 2, self.mp3Url);
        output.V(serialDesc, 3, self.mp3Checksum);
        output.V(serialDesc, 4, self.category);
        output.o(serialDesc, 5, g1.f34588a, self.iconUrl);
        if (output.C(serialDesc) || self.audioFiles != null) {
            output.o(serialDesc, 6, (KSerializer) hVarArr[6].getValue(), self.audioFiles);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getSoundscapeId() {
        return this.soundscapeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMp3Url() {
        return this.mp3Url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMp3Checksum() {
        return this.mp3Checksum;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final List<ReaderSoundscapeAudioFile> component7() {
        return this.audioFiles;
    }

    public final ReaderSoundscape copy(String soundscapeId, String r10, String mp3Url, String mp3Checksum, String category, String iconUrl, List<ReaderSoundscapeAudioFile> audioFiles) {
        soundscapeId.getClass();
        r10.getClass();
        mp3Url.getClass();
        mp3Checksum.getClass();
        category.getClass();
        return new ReaderSoundscape(soundscapeId, r10, mp3Url, mp3Checksum, category, iconUrl, audioFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderSoundscape)) {
            return false;
        }
        ReaderSoundscape readerSoundscape = (ReaderSoundscape) other;
        if (m.c(this.soundscapeId, readerSoundscape.soundscapeId) && m.c(this.name, readerSoundscape.name) && m.c(this.mp3Url, readerSoundscape.mp3Url) && m.c(this.mp3Checksum, readerSoundscape.mp3Checksum) && m.c(this.category, readerSoundscape.category) && m.c(this.iconUrl, readerSoundscape.iconUrl) && m.c(this.audioFiles, readerSoundscape.audioFiles)) {
            return true;
        }
        return false;
    }

    public final List<ReaderSoundscapeAudioFile> getAudioFiles() {
        return this.audioFiles;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMp3Checksum() {
        return this.mp3Checksum;
    }

    public final String getMp3Url() {
        return this.mp3Url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSoundscapeId() {
        return this.soundscapeId;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.c(c.c(c.c(this.soundscapeId.hashCode() * 31, 31, this.name), 31, this.mp3Url), 31, this.mp3Checksum), 31, this.category);
        String str = this.iconUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        List<ReaderSoundscapeAudioFile> list = this.audioFiles;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.soundscapeId;
        String str2 = this.name;
        String str3 = this.mp3Url;
        String str4 = this.mp3Checksum;
        String str5 = this.category;
        String str6 = this.iconUrl;
        List<ReaderSoundscapeAudioFile> list = this.audioFiles;
        StringBuilder s10 = f.s("ReaderSoundscape(soundscapeId=", str, ", name=", str2, ", mp3Url=");
        f.x(s10, str3, ", mp3Checksum=", str4, ", category=");
        f.x(s10, str5, ", iconUrl=", str6, ", audioFiles=");
        return z.h.e(s10, list, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReaderSoundscape$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReaderSoundscape;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderSoundscape$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAudioFiles$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getIconUrl$annotations() {
    }

    public static /* synthetic */ void getMp3Checksum$annotations() {
    }

    public static /* synthetic */ void getMp3Url$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getSoundscapeId$annotations() {
    }

    public ReaderSoundscape(String str, String str2, String str3, String str4, String str5, String str6, List<ReaderSoundscapeAudioFile> list) {
        c.v(str, str2, str3, str4, str5);
        this.soundscapeId = str;
        this.name = str2;
        this.mp3Url = str3;
        this.mp3Checksum = str4;
        this.category = str5;
        this.iconUrl = str6;
        this.audioFiles = list;
    }

    public /* synthetic */ ReaderSoundscape(String str, String str2, String str3, String str4, String str5, String str6, List list, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? null : list);
    }
}

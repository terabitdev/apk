package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\bE\u00106\u001a\u0004\bD\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bH\u00106\u001a\u0004\bG\u0010!¨\u0006K"}, d2 = {"Lio/elevenlabs/data/model/ReadUpdateModel;", "", "", "lastListenedCharOffset", "", "title", "author", "description", "", "markedAsUnread", "completedAtUnix", "audioFileNumber", "", "positionSeconds", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Lur/c1;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/lang/Long;", "component7", "component8", "()Ljava/lang/Double;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)Lio/elevenlabs/data/model/ReadUpdateModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReadUpdateModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getLastListenedCharOffset", "getLastListenedCharOffset$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getAuthor", "getAuthor$annotations", "getDescription", "getDescription$annotations", "Ljava/lang/Boolean;", "getMarkedAsUnread", "getMarkedAsUnread$annotations", "Ljava/lang/Long;", "getCompletedAtUnix", "getCompletedAtUnix$annotations", "getAudioFileNumber", "getAudioFileNumber$annotations", "Ljava/lang/Double;", "getPositionSeconds", "getPositionSeconds$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadUpdateModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String audioFileNumber;
    private final String author;
    private final Long completedAtUnix;
    private final String description;
    private final long lastListenedCharOffset;
    private final Boolean markedAsUnread;
    private final Double positionSeconds;
    private final String title;

    public /* synthetic */ ReadUpdateModel(int i10, long j4, String str, String str2, String str3, Boolean bool, Long l4, String str4, Double d10, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.lastListenedCharOffset = j4;
            if ((i10 & 2) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i10 & 4) == 0) {
                this.author = null;
            } else {
                this.author = str2;
            }
            if ((i10 & 8) == 0) {
                this.description = null;
            } else {
                this.description = str3;
            }
            if ((i10 & 16) == 0) {
                this.markedAsUnread = null;
            } else {
                this.markedAsUnread = bool;
            }
            if ((i10 & 32) == 0) {
                this.completedAtUnix = null;
            } else {
                this.completedAtUnix = l4;
            }
            if ((i10 & 64) == 0) {
                this.audioFileNumber = null;
            } else {
                this.audioFileNumber = str4;
            }
            if ((i10 & 128) == 0) {
                this.positionSeconds = null;
                return;
            } else {
                this.positionSeconds = d10;
                return;
            }
        }
        t0.j(i10, 1, ReadUpdateModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ReadUpdateModel copy$default(ReadUpdateModel readUpdateModel, long j4, String str, String str2, String str3, Boolean bool, Long l4, String str4, Double d10, int i10, Object obj) {
        Boolean bool2;
        Long l7;
        String str5;
        Double d11;
        if ((i10 & 1) != 0) {
            j4 = readUpdateModel.lastListenedCharOffset;
        }
        long j10 = j4;
        if ((i10 & 2) != 0) {
            str = readUpdateModel.title;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = readUpdateModel.author;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = readUpdateModel.description;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            bool2 = readUpdateModel.markedAsUnread;
        } else {
            bool2 = bool;
        }
        if ((i10 & 32) != 0) {
            l7 = readUpdateModel.completedAtUnix;
        } else {
            l7 = l4;
        }
        if ((i10 & 64) != 0) {
            str5 = readUpdateModel.audioFileNumber;
        } else {
            str5 = str4;
        }
        if ((i10 & 128) != 0) {
            d11 = readUpdateModel.positionSeconds;
        } else {
            d11 = d10;
        }
        return readUpdateModel.copy(j10, str6, str7, str8, bool2, l7, str5, d11);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadUpdateModel self, b output, SerialDescriptor serialDesc) {
        output.h0(serialDesc, 0, self.lastListenedCharOffset);
        if (output.C(serialDesc) || self.title != null) {
            output.o(serialDesc, 1, g1.f34588a, self.title);
        }
        if (output.C(serialDesc) || self.author != null) {
            output.o(serialDesc, 2, g1.f34588a, self.author);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.o(serialDesc, 3, g1.f34588a, self.description);
        }
        if (output.C(serialDesc) || self.markedAsUnread != null) {
            output.o(serialDesc, 4, ur.g.f34583a, self.markedAsUnread);
        }
        if (output.C(serialDesc) || self.completedAtUnix != null) {
            output.o(serialDesc, 5, l0.f34611a, self.completedAtUnix);
        }
        if (output.C(serialDesc) || self.audioFileNumber != null) {
            output.o(serialDesc, 6, g1.f34588a, self.audioFileNumber);
        }
        if (output.C(serialDesc) || self.positionSeconds != null) {
            output.o(serialDesc, 7, r.f34640a, self.positionSeconds);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final long getLastListenedCharOffset() {
        return this.lastListenedCharOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getMarkedAsUnread() {
        return this.markedAsUnread;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getCompletedAtUnix() {
        return this.completedAtUnix;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getPositionSeconds() {
        return this.positionSeconds;
    }

    public final ReadUpdateModel copy(long lastListenedCharOffset, String title, String author, String description, Boolean markedAsUnread, Long completedAtUnix, String audioFileNumber, Double positionSeconds) {
        return new ReadUpdateModel(lastListenedCharOffset, title, author, description, markedAsUnread, completedAtUnix, audioFileNumber, positionSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadUpdateModel)) {
            return false;
        }
        ReadUpdateModel readUpdateModel = (ReadUpdateModel) other;
        if (this.lastListenedCharOffset == readUpdateModel.lastListenedCharOffset && m.c(this.title, readUpdateModel.title) && m.c(this.author, readUpdateModel.author) && m.c(this.description, readUpdateModel.description) && m.c(this.markedAsUnread, readUpdateModel.markedAsUnread) && m.c(this.completedAtUnix, readUpdateModel.completedAtUnix) && m.c(this.audioFileNumber, readUpdateModel.audioFileNumber) && m.c(this.positionSeconds, readUpdateModel.positionSeconds)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Long getCompletedAtUnix() {
        return this.completedAtUnix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getLastListenedCharOffset() {
        return this.lastListenedCharOffset;
    }

    public final Boolean getMarkedAsUnread() {
        return this.markedAsUnread;
    }

    public final Double getPositionSeconds() {
        return this.positionSeconds;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = Long.hashCode(this.lastListenedCharOffset) * 31;
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode7 + hashCode) * 31;
        String str2 = this.author;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Boolean bool = this.markedAsUnread;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Long l4 = this.completedAtUnix;
        if (l4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l4.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str4 = this.audioFileNumber;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Double d10 = this.positionSeconds;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        long j4 = this.lastListenedCharOffset;
        String str = this.title;
        String str2 = this.author;
        String str3 = this.description;
        Boolean bool = this.markedAsUnread;
        Long l4 = this.completedAtUnix;
        String str4 = this.audioFileNumber;
        Double d10 = this.positionSeconds;
        StringBuilder sb = new StringBuilder("ReadUpdateModel(lastListenedCharOffset=");
        sb.append(j4);
        sb.append(", title=");
        sb.append(str);
        f.x(sb, ", author=", str2, ", description=", str3);
        sb.append(", markedAsUnread=");
        sb.append(bool);
        sb.append(", completedAtUnix=");
        sb.append(l4);
        sb.append(", audioFileNumber=");
        sb.append(str4);
        sb.append(", positionSeconds=");
        sb.append(d10);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReadUpdateModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReadUpdateModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadUpdateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAudioFileNumber$annotations() {
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getCompletedAtUnix$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getLastListenedCharOffset$annotations() {
    }

    public static /* synthetic */ void getMarkedAsUnread$annotations() {
    }

    public static /* synthetic */ void getPositionSeconds$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public ReadUpdateModel(long j4, String str, String str2, String str3, Boolean bool, Long l4, String str4, Double d10) {
        this.lastListenedCharOffset = j4;
        this.title = str;
        this.author = str2;
        this.description = str3;
        this.markedAsUnread = bool;
        this.completedAtUnix = l4;
        this.audioFileNumber = str4;
        this.positionSeconds = d10;
    }

    public /* synthetic */ ReadUpdateModel(long j4, String str, String str2, String str3, Boolean bool, Long l4, String str4, Double d10, int i10, kotlin.jvm.internal.f fVar) {
        this(j4, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l4, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : d10);
    }
}

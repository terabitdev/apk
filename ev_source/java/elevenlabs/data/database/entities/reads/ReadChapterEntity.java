package io.elevenlabs.data.database.entities.reads;

import android.gov.nist.core.Separators;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00060"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "", "read_id", "", "chapter_index", "", "chapter_name", "char_count", "", "has_summary", "", "word_count", "starting_char_offset", "duration_seconds", "", "audio_file_number", "<init>", "(Ljava/lang/String;ILjava/lang/String;JZJJLjava/lang/Double;Ljava/lang/String;)V", "getRead_id", "()Ljava/lang/String;", "getChapter_index", "()I", "getChapter_name", "getChar_count", "()J", "getHas_summary", "()Z", "getWord_count", "getStarting_char_offset", "getDuration_seconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudio_file_number", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;JZJJLjava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadChapterEntity {
    private final String audio_file_number;
    private final int chapter_index;
    private final String chapter_name;
    private final long char_count;
    private final Double duration_seconds;
    private final boolean has_summary;
    private final String read_id;
    private final long starting_char_offset;
    private final long word_count;

    public ReadChapterEntity(String str, int i10, String str2, long j4, boolean z6, long j10, long j11, Double d10, String str3) {
        str.getClass();
        str2.getClass();
        this.read_id = str;
        this.chapter_index = i10;
        this.chapter_name = str2;
        this.char_count = j4;
        this.has_summary = z6;
        this.word_count = j10;
        this.starting_char_offset = j11;
        this.duration_seconds = d10;
        this.audio_file_number = str3;
    }

    public static /* synthetic */ ReadChapterEntity copy$default(ReadChapterEntity readChapterEntity, String str, int i10, String str2, long j4, boolean z6, long j10, long j11, Double d10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = readChapterEntity.read_id;
        }
        if ((i11 & 2) != 0) {
            i10 = readChapterEntity.chapter_index;
        }
        if ((i11 & 4) != 0) {
            str2 = readChapterEntity.chapter_name;
        }
        if ((i11 & 8) != 0) {
            j4 = readChapterEntity.char_count;
        }
        if ((i11 & 16) != 0) {
            z6 = readChapterEntity.has_summary;
        }
        if ((i11 & 32) != 0) {
            j10 = readChapterEntity.word_count;
        }
        if ((i11 & 64) != 0) {
            j11 = readChapterEntity.starting_char_offset;
        }
        if ((i11 & 128) != 0) {
            d10 = readChapterEntity.duration_seconds;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str3 = readChapterEntity.audio_file_number;
        }
        long j12 = j11;
        boolean z10 = z6;
        long j13 = j4;
        String str4 = str2;
        return readChapterEntity.copy(str, i10, str4, j13, z10, j10, j12, d10, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRead_id() {
        return this.read_id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChapter_index() {
        return this.chapter_index;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChapter_name() {
        return this.chapter_name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getChar_count() {
        return this.char_count;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHas_summary() {
        return this.has_summary;
    }

    /* renamed from: component6, reason: from getter */
    public final long getWord_count() {
        return this.word_count;
    }

    /* renamed from: component7, reason: from getter */
    public final long getStarting_char_offset() {
        return this.starting_char_offset;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getDuration_seconds() {
        return this.duration_seconds;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAudio_file_number() {
        return this.audio_file_number;
    }

    public final ReadChapterEntity copy(String read_id, int chapter_index, String chapter_name, long char_count, boolean has_summary, long word_count, long starting_char_offset, Double duration_seconds, String audio_file_number) {
        read_id.getClass();
        chapter_name.getClass();
        return new ReadChapterEntity(read_id, chapter_index, chapter_name, char_count, has_summary, word_count, starting_char_offset, duration_seconds, audio_file_number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadChapterEntity)) {
            return false;
        }
        ReadChapterEntity readChapterEntity = (ReadChapterEntity) other;
        if (m.c(this.read_id, readChapterEntity.read_id) && this.chapter_index == readChapterEntity.chapter_index && m.c(this.chapter_name, readChapterEntity.chapter_name) && this.char_count == readChapterEntity.char_count && this.has_summary == readChapterEntity.has_summary && this.word_count == readChapterEntity.word_count && this.starting_char_offset == readChapterEntity.starting_char_offset && m.c(this.duration_seconds, readChapterEntity.duration_seconds) && m.c(this.audio_file_number, readChapterEntity.audio_file_number)) {
            return true;
        }
        return false;
    }

    public final String getAudio_file_number() {
        return this.audio_file_number;
    }

    public final int getChapter_index() {
        return this.chapter_index;
    }

    public final String getChapter_name() {
        return this.chapter_name;
    }

    public final long getChar_count() {
        return this.char_count;
    }

    public final Double getDuration_seconds() {
        return this.duration_seconds;
    }

    public final boolean getHas_summary() {
        return this.has_summary;
    }

    public final String getRead_id() {
        return this.read_id;
    }

    public final long getStarting_char_offset() {
        return this.starting_char_offset;
    }

    public final long getWord_count() {
        return this.word_count;
    }

    public int hashCode() {
        int hashCode;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.starting_char_offset, com.google.android.gms.internal.play_billing.b.g(this.word_count, com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.g(this.char_count, j0.c.c(j0.c.b(this.chapter_index, this.read_id.hashCode() * 31, 31), 31, this.chapter_name), 31), 31, this.has_summary), 31), 31);
        Double d10 = this.duration_seconds;
        int i10 = 0;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str = this.audio_file_number;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.read_id;
        int i10 = this.chapter_index;
        String str2 = this.chapter_name;
        long j4 = this.char_count;
        boolean z6 = this.has_summary;
        long j10 = this.word_count;
        long j11 = this.starting_char_offset;
        Double d10 = this.duration_seconds;
        String str3 = this.audio_file_number;
        StringBuilder o6 = android.gov.nist.javax.sip.header.a.o(i10, "ReadChapterEntity(read_id=", str, ", chapter_index=", ", chapter_name=");
        o6.append(str2);
        o6.append(", char_count=");
        o6.append(j4);
        o6.append(", has_summary=");
        o6.append(z6);
        o6.append(", word_count=");
        o6.append(j10);
        com.google.android.gms.internal.play_billing.b.w(o6, ", starting_char_offset=", j11, ", duration_seconds=");
        o6.append(d10);
        o6.append(", audio_file_number=");
        o6.append(str3);
        o6.append(Separators.RPAREN);
        return o6.toString();
    }

    public /* synthetic */ ReadChapterEntity(String str, int i10, String str2, long j4, boolean z6, long j10, long j11, Double d10, String str3, int i11, kotlin.jvm.internal.f fVar) {
        this(str, i10, str2, j4, z6, j10, j11, (i11 & 128) != 0 ? null : d10, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str3);
    }
}

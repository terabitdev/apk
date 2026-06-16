package io.elevenlabs.domain.model;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/model/ReadSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "File", "Website", "Text", "Podcast", "Book", "Bulletin", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReadSource[] $VALUES;
    private final String value;
    public static final ReadSource File = new ReadSource("File", 0, "file");
    public static final ReadSource Website = new ReadSource("Website", 1, "website");
    public static final ReadSource Text = new ReadSource("Text", 2, ParameterNames.TEXT);
    public static final ReadSource Podcast = new ReadSource("Podcast", 3, "podcast");
    public static final ReadSource Book = new ReadSource("Book", 4, "book");
    public static final ReadSource Bulletin = new ReadSource("Bulletin", 5, "bulletin");

    private static final /* synthetic */ ReadSource[] $values() {
        return new ReadSource[]{File, Website, Text, Podcast, Book, Bulletin};
    }

    static {
        ReadSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private ReadSource(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ReadSource valueOf(String str) {
        return (ReadSource) Enum.valueOf(ReadSource.class, str);
    }

    public static ReadSource[] values() {
        return (ReadSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

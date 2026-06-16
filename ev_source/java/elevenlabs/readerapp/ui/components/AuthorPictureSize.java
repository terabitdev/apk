package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/AuthorPictureSize;", "", "Lh5/f;", "dp", "<init>", "(Ljava/lang/String;IF)V", TokenNames.F, "getDp-D9Ej5fM", "()F", "Small", "Medium", "Large", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorPictureSize {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ AuthorPictureSize[] $VALUES;
    private final float dp;
    public static final AuthorPictureSize Small = new AuthorPictureSize("Small", 0, 48);
    public static final AuthorPictureSize Medium = new AuthorPictureSize("Medium", 1, 56);
    public static final AuthorPictureSize Large = new AuthorPictureSize("Large", 2, 64);

    private static final /* synthetic */ AuthorPictureSize[] $values() {
        return new AuthorPictureSize[]{Small, Medium, Large};
    }

    static {
        AuthorPictureSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private AuthorPictureSize(String str, int i10, float f10) {
        this.dp = f10;
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static AuthorPictureSize valueOf(String str) {
        return (AuthorPictureSize) Enum.valueOf(AuthorPictureSize.class, str);
    }

    public static AuthorPictureSize[] values() {
        return (AuthorPictureSize[]) $VALUES.clone();
    }

    /* renamed from: getDp-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDp() {
        return this.dp;
    }
}

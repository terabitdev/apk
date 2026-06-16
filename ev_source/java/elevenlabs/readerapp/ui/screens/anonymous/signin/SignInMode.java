package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "SIGN_IN_EMAIL", "SIGN_UP_EMAIL", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SignInMode {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ SignInMode[] $VALUES;
    public static final SignInMode INTRO = new SignInMode("INTRO", 0);
    public static final SignInMode SIGN_IN_EMAIL = new SignInMode("SIGN_IN_EMAIL", 1);
    public static final SignInMode SIGN_UP_EMAIL = new SignInMode("SIGN_UP_EMAIL", 2);

    private static final /* synthetic */ SignInMode[] $values() {
        return new SignInMode[]{INTRO, SIGN_IN_EMAIL, SIGN_UP_EMAIL};
    }

    static {
        SignInMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private SignInMode(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static SignInMode valueOf(String str) {
        return (SignInMode) Enum.valueOf(SignInMode.class, str);
    }

    public static SignInMode[] values() {
        return (SignInMode[]) $VALUES.clone();
    }
}

package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory INSTANCE = new AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory();

        private InstanceHolder() {
        }
    }

    public static AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String providesAnonCaptchaSiteKey() {
        String providesAnonCaptchaSiteKey = AnonCaptchaModule.INSTANCE.providesAnonCaptchaSiteKey();
        m0.n(providesAnonCaptchaSiteKey);
        return providesAnonCaptchaSiteKey;
    }

    @Override // rn.a
    public String get() {
        return providesAnonCaptchaSiteKey();
    }
}

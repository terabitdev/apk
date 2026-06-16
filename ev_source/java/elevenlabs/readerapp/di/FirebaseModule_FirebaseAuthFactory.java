package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import com.google.firebase.auth.FirebaseAuth;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FirebaseModule_FirebaseAuthFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final FirebaseModule_FirebaseAuthFactory INSTANCE = new FirebaseModule_FirebaseAuthFactory();

        private InstanceHolder() {
        }
    }

    public static FirebaseModule_FirebaseAuthFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FirebaseAuth firebaseAuth() {
        FirebaseAuth firebaseAuth = FirebaseModule.INSTANCE.firebaseAuth();
        m0.n(firebaseAuth);
        return firebaseAuth;
    }

    @Override // rn.a
    public FirebaseAuth get() {
        return firebaseAuth();
    }
}

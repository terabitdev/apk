package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import androidx.lifecycle.j1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LibraryViewModel_HiltModules {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract j1 binds(LibraryViewModel libraryViewModel);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static boolean provide() {
            return true;
        }
    }

    private LibraryViewModel_HiltModules() {
    }
}
